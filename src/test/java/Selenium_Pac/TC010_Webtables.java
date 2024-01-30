package Selenium_Pac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC010_Webtables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/table");
		driver.manage().window().maximize();
		
		WebElement table = driver.findElement(By.id("simpletable"));
		List<WebElement> headers = table.findElements(By.tagName("th"));
		
		for(WebElement header:headers)
		{
			System.out.println(header.getText());
		}
		List<WebElement> allrows=table.findElements(By.tagName("tr"));
		System.out.println("rows:"+allrows.size());
		
		for(WebElement row:allrows)
		{
			List<WebElement> columns=row.findElements(By.tagName("td"));
			System.out.println(columns.get(0).getText());
		}

	}

}
