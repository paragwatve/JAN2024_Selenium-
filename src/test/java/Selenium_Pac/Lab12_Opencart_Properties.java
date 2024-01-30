package Selenium_Pac;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab12_Opencart_Properties {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		InputStream input1 = new FileInputStream("C:\\Users\\parag.watve\\eclipse-workspace\\JAN2024_Selenium\\Opencart.properties");
		Properties prop = new Properties();
		prop.load(input1);
		String url = prop.getProperty("url");
		String prdt = prop.getProperty("product");
		String prdt2 = prop.getProperty("product2");
		System.out.println("The URL is: "+ url);
		System.out.println("The product is: "+ prdt);
		System.out.println("The product2 is: "+ prdt2);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		Lab12_Opencart_POM obj = new Lab12_Opencart_POM(driver);
		obj.desktop();
		obj.mac();
		obj.sort(1);
		obj.search();
		obj.search2(prdt);
		
		obj.tick();
		obj.searchbutton();
		driver.navigate().back();
		
		obj.clear1();
		Thread.sleep(3000);
		obj.search2(prdt2);
		obj.searchbutton();
	}
}

