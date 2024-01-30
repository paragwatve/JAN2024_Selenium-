package Selenium_Pac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab6_Seleniumvalidations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.name("email")).sendKeys("sanketpatil@gmail.com");
		driver.findElement(By.name("password")).sendKeys("patil@12");
		driver.findElement(By.tagName("button")).click();
		
		WebElement ele = driver.findElement(By.linkText("Components"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		driver.findElement(By.linkText("Monitors (2)")).click();
		Select show = new Select(driver.findElement(By.xpath("//select[@id=\"input-limit\"]")));
		show.selectByIndex(1);
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		driver.findElement(By.xpath("//*[@id=\"product-list\"]/div[1]/form/div/div[2]/div[1]/h4/a")).click();
		JavascriptExecutor js1 =(JavascriptExecutor)driver;
		JavascriptExecutor js2 =(JavascriptExecutor)driver;
		js2.executeScript("window.scrollBy(0,300)");
		driver.findElement(By.id("input-option-value-6")).click();
		JavascriptExecutor js3 =(JavascriptExecutor)driver;
		js3.executeScript("window.scrollBy(0,100)");
		driver.findElement(By.id("input-option-value-9")).click();
		JavascriptExecutor js4 =(JavascriptExecutor)driver;
		js4.executeScript("window.scrollBy(0,300)");
		driver.findElement(By.id("input-option-208")).clear();
		driver.findElement(By.id("input-option-208")).sendKeys("Test1");
		JavascriptExecutor js5 =(JavascriptExecutor)driver;
		js5.executeScript("window.scrollBy(0,300)");
		Select show1 = new Select(driver.findElement(By.id("input-option-217")));
		show1.selectByIndex(1);
		JavascriptExecutor js6 =(JavascriptExecutor)driver;
		js6.executeScript("window.scrollBy(0,100)");
		driver.findElement(By.id("input-option-209")).sendKeys("we are just testing");
	}

}
