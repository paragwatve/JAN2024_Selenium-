package Cucumber_Pac;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import TestNG_Pac.ORHM_POM_TestNG;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC002_Stepdefinitions {

@Given("Start the browser")
public void Start_the_browser() throws Exception {
	WebDriver driver;
	
	InputStream input1 = new FileInputStream("C:\\\\Users\\\\parag.watve\\\\eclipse-workspace\\\\JAN2024_Selenium\\\\logindata.properties");
	Properties prob = new Properties();
	prob.load(input1);
	String url = prob.getProperty("url");
	System.out.println("The URL is:" + url);
	
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  long timestamp = new Date().getTime();
	  File f1 = new File("C:\\\\Users\\\\parag.watve\\\\eclipse-workspace\\\\JAN2024_Selenium\\\\inputdata.xlsx");
      FileInputStream fis = new FileInputStream(f1);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("Row Count: "+rowCount);
		String[][] data = new String[2][2];
		
		for(int i=0;i<rowCount;i++) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(url);
			
			data[i][0]=sheet.getRow(i).getCell(0).getStringCellValue();
			data[i][1]=sheet.getRow(i).getCell(1).getStringCellValue();
			String uname = data[i][0];
			String pwd = data[i][1];
			System.out.println("Username: "+uname);
			System.out.println("Password: "+pwd);	
	  
	  ORHM_POM_TestNG obj = new ORHM_POM_TestNG(driver);
	  String title=driver.getTitle();
	  //Assert.assertEquals(title, "OrangeHRM");
	  
	  ExtentReports extent=new ExtentReports();
		ExtentSparkReporter spark=new ExtentSparkReporter(timestamp+"23rdJan2024Testng.html");
		extent.attachReporter(spark);
		ExtentTest test=extent.createTest("Verify the Title of OrangeHRM");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			  
		obj.enterusername(uname);
		obj.enterpassword(pwd);
		obj.clickonlogin();


			if(obj.verifylogin())
			{
				System.out.println("Login");	
			}
			else
			{
				System.out.println("Failed");
			}
	driver.quit();
		}
	}
}
