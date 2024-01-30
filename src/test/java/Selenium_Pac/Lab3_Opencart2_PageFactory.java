package Selenium_Pac;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab3_Opencart2_PageFactory {

	private static int i;

	public static void main(String[] args) throws Exception {
		 WebDriverManager.chromedriver().setup();
			
			WebDriver driver= new ChromeDriver();
			
			driver.get("http://demo.opencart.com");
			
		Lab3_OpencartPOM2_PageFactory obj= PageFactory.initElements(driver,Lab3_OpencartPOM2_PageFactory.class);	
			obj.desktop();
			obj.mac();
		    obj.sort(i);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,800)");
			obj.addcart();
	}

}

	
