package Selenium_Pac;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Labdemo5_Register {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.name("firstname")).sendKeys("sanket");
		driver.findElement(By.name("lastname")).sendKeys("patil");
		driver.findElement(By.name("email")).sendKeys("sanketpatil@gmail.com");
		driver.findElement(By.name("password")).sendKeys("patil@12");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(2000);
		driver.findElement(By.id("input-newsletter-yes")).click();
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.quit();
		System.out.println("You have registered successfully");

	}

}
