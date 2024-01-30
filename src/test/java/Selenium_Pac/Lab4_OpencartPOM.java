package Selenium_Pac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab4_OpencartPOM {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		
		
		Lab4_OpencartPOM1 obj = new Lab4_OpencartPOM1(driver);
		obj.desktop();
		obj.mac();
		obj.sort(1);
		obj.search();
		obj.search2("Mobile");
		obj.tick();
		obj.searchbutton();
	}
}
