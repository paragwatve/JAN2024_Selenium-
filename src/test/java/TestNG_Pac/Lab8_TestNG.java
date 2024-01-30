package TestNG_Pac;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Lab8_TestNG {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String email, String password) {
	  WebDriverManager.chromedriver().setup();	
		driver= new ChromeDriver();
		driver.get("http://demo.opencart.com");
	    driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.tagName("button")).click();
		boolean opencart = driver.findElement(By.xpath("//*[@id=\"logo\"]/a/img")).isDisplayed();
		assertEquals(opencart,true);
		
		WebElement ele = driver.findElement(By.linkText("Desktops"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		driver.findElement(By.linkText("Mac (1)")).click();
		Select show = new Select(driver.findElement(By.xpath("//select[@id=\"input-limit\"]")));
		show.selectByIndex(1);
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		driver.findElement(By.xpath("//*[@id=\"product-list\"]/div[1]/form/div/div[2]/div[1]/h4/a")).click();
		JavascriptExecutor js1 =(JavascriptExecutor)driver;
		JavascriptExecutor js2 =(JavascriptExecutor)driver;
		js2.executeScript("window.scrollBy(0,300)");
		driver.findElement(By.id("button-cart")).click();

  }
  @BeforeMethod
  public void beforeMethod() { 
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "sanketpatil@gmail.com","patil@12"},
    };
  }
}

