package Selenium_Pac;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC004_Actions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		System.out.println("Verify My Account:"+driver.findElement(By.linkText("My Account")).isDisplayed());
		System.out.println("Text of My Account is:"+driver.findElement(By.linkText("My Account")).getText());
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).click();
		
		Actions act=new Actions(driver);
		act.sendKeys("fati@yahoo.com");
		act.sendKeys(Keys.TAB);
		act.sendKeys("welcome");
		act.sendKeys(Keys.TAB);
		act.sendKeys(Keys.TAB);
		act.sendKeys(Keys.ENTER);
		
		act.perform();

	}

}
