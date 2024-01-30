package TestNG_Pac;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class TC003_TestNG {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void Test(String uname, String pword,String browser) throws InterruptedException, IOException {
	  long timestamp = new Date().getTime();
	  System.out.println("Time is:"+timestamp);
	//    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	//	Thread.sleep(3000);
		Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
	    String browserName = cap.getBrowserName().toLowerCase();
	    System.out.println(browserName);
	    
		ORHM_POM_TestNG obj = new ORHM_POM_TestNG(driver);
		String title = driver.getTitle();
	//	Assert.assertEquals(title, "OrangeHRM");
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter(timestamp+"23rdJan2024Testng.html");
		extent.attachReporter(spark);
		ExtentTest test=extent.createTest("Verify the title of OrangeHRM"+browserName);
		if(title.equals("OrangeHRM1"))
		{
			test.pass("OrangeHRM title is displayed");
		}
		else
		{
			File sfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dfile= new File("p1.jpg");
			FileUtils.copyFile(sfile, dfile);
			String path = dfile.getAbsolutePath();
			test.fail("OrangeHRM title is not displayed"
					,MediaEntityBuilder
					.createScreenCaptureFromPath("img1.jpg")
					.build()
					);
			test.addScreenCaptureFromPath(path);
		}
		if(obj.verifyusername())
		{
			test.pass("username is displayed");
		}
		else
		{
			Thread.sleep(5000);
			File sfile1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dfile1= new File("p1.jpg");
			FileUtils.copyFile(sfile1, dfile1);
			String path = dfile1.getAbsolutePath();
			test.fail("OrangeHRM title is not displayed"
					,MediaEntityBuilder
					.createScreenCaptureFromPath("img1.jpg")
					.build()
					);
			//test.addScreenCaptureFromPath(path);
		}
		if(obj.verifypassword())
		{
			test.pass("password is displayed");
		}
		else
		{
			Thread.sleep(5000);
			File sfile2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dfile2= new File("p1.jpg");
			FileUtils.copyFile(sfile2, dfile2);
			String path = dfile2.getAbsolutePath();
			test.fail("OrangeHRM title is not displayed"
					,MediaEntityBuilder
					.createScreenCaptureFromPath("img1.jpg")
					.build()
					);
			//test.addScreenCaptureFromPath(path);
		}
		if(obj.verifylogin())
		{
			test.pass("login is successful");
		}
		else
		{
			Thread.sleep(5000);
			File sfile3=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dfile3= new File("p1.jpg");
			FileUtils.copyFile(sfile3, dfile3);
			String path = dfile3.getAbsolutePath();
			test.fail("Login is not successful"
					,MediaEntityBuilder
					.createScreenCaptureFromPath("img1.jpg")
					.build()
					);
			test.addScreenCaptureFromPath(path);
		}
		
		driver.findElement(By.name("username")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pword);
		driver.findElement(By.tagName("button")).click();
		extent.flush();
  }
  @Parameters("Browser")
  @BeforeMethod
  public void beforeMethod(String browser) throws IOException {
	 // InputStream input1 = new FileInputStream("C:\\Users\\parag.watve\\eclipse-workspace\\JAN2024_Selenium\\logindata.properties");
		
	// parag = driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//Properties prob = new Properties();
		//prob.load(input1);
		//String url =prob.getProperty("url");
		//System.out.println("The URL is:"+url);
		//System.out.println("the browser is:"+browser);
		
		System.out.println("browser is : "+browser);

		if(browser.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		}
		else if(browser.equalsIgnoreCase("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		}
		else
		{
			System.out.println("Browser is not matched");
		}
	}

  

  @AfterMethod
  public void afterMethod() {
	 // driver.quit();
  }
 
  @DataProvider
  public Object [][] dp() throws IOException {
  File f1 = new File("C:\\Users\\parag.watve\\eclipse-workspace\\JAN2024_Selenium\\exceldata.xlsx");
	FileInputStream fis = new FileInputStream(f1);
	XSSFWorkbook workbook = new XSSFWorkbook(fis);
	XSSFSheet sheet = workbook.getSheetAt(0);
	
	int rowcount = sheet.getPhysicalNumberOfRows();
	System.out.println("Row count:"+rowcount);
	
	String[][] data =new String[2][2];
	{
	for(int i=0;i<rowcount;i++)
	{
		data [i][0]=sheet.getRow(i).getCell(0).getStringCellValue();
		data [i][1]=sheet.getRow(i).getCell(1).getStringCellValue();

		String uname=data[i][0];
		String pword=data[i][1];
		
		
		System.out.println("username:"+uname);
		System.out.println("password:"+pword);
     }
   }
	return data;
  }

}
