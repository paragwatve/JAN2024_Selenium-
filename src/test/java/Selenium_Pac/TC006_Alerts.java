package Selenium_Pac;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC006_Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/alert");
		driver.findElement(By.id("accept")).click();
		
		Alert simplealert = driver.switchTo().alert();
		System.out.println(simplealert.getText());
		simplealert.accept();
		
		driver.findElement(By.id("confirm")).click();
		Alert confirmalert=driver.switchTo().alert();
		System.out.println(confirmalert.getText());
		confirmalert.accept();
		
		driver.findElement(By.id("prompt")).click();
		Alert promptalert=driver.switchTo().alert();
		System.out.println(promptalert.getText());
		promptalert.sendKeys("Parag");
		promptalert.accept();
		driver.quit();

}
}