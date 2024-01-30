package Selenium_Pac;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC011_POM2_xml {

	public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
		// TODO Auto-generated method stub
		
//		File f1 = new File("C:\\Users\\parag.watve\\eclipse-workspace\\JAN2024_Selenium\\inputdata.xlsx");
//		FileInputStream fis = new FileInputStream(f1);
//		XSSFWorkbook workbook = new XSSFWorkbook(fis);
//		XSSFSheet sheet = workbook.getSheetAt(0);
//		
//		int rowcount = sheet.getPhysicalNumberOfRows();
//		System.out.println("Row count:"+rowcount);
//		
//		String[][] data =new String[3][2];
//		for(int i=0;i<rowcount;i++)
//		{
//			data [i][0]=sheet.getRow(i).getCell(0).getStringCellValue();
//			data [i][1]=sheet.getRow(i).getCell(1).getStringCellValue();
//			String uname=data[i][0];
//			String pword=data[i][1];
//			System.out.println("username:"+uname);
//			System.out.println("password:"+pword);
        File xmlfile = new File("C:\\\\Users\\\\parag.watve\\\\eclipse-workspace\\\\JAN2024_Selenium\\\\logindata.xml");
        DocumentBuilderFactory DBFactory=DocumentBuilderFactory.newInstance();
        DocumentBuilder dbuilder=DBFactory.newDocumentBuilder();
        Document doc = dbuilder.parse(xmlfile);
        NodeList n1 =doc.getChildNodes();
        Node n =n1.item(0);
        Element ele=(Element)n;
        String url=ele.getElementsByTagName("url").item(0).getTextContent();
        String uname=ele.getElementsByTagName("username").item(0).getTextContent();
        String pword=ele.getElementsByTagName("password").item(0).getTextContent();
        
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		ORHM_POM obj = new ORHM_POM(driver);
		obj.enterusername(uname);
		obj.enterpassword(pword);
		obj.clickonlogin();
//		driver.findElement(By.name("username")).sendKeys("Admin");
//	    driver.findElement(By.name("password")).sendKeys("admin123");
//	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	}
