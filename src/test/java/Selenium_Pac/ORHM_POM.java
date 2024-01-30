package Selenium_Pac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ORHM_POM {
	WebDriver driver;
	
	
	By uname= By.name("username");
	By pword = By.name("password");
	By loginbutton = By.xpath("//button[@type='submit']");
	
	public ORHM_POM(WebDriver driver2) {
		this.driver = driver2;
	}
	public boolean verifyusername()
	{
		boolean isusername_displayed=driver.findElement(uname).isDisplayed();
		return isusername_displayed;	
	}				
	
	public void enterusername(String username1)
	{
		driver.findElement(uname).sendKeys(username1);
	}
	public void enterpassword(String password1)
	{
		driver.findElement(pword).sendKeys(password1);
	}
	
	public void clickonlogin()
	{
		driver.findElement(loginbutton).click();
	}
}
