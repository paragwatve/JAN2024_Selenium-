package Selenium_Pac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ORHM_POM2_PageFactory {
	WebDriver driver;
	
	//By uname= By.name("username");
	@FindBy(name="username")
	WebElement username;
	//By pword = By.name("password");
	@FindBy(name="password")
	WebElement password;
	//By loginbutton = By.xpath("//button[@type='submit']");
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginbutton;
	
	public ORHM_POM2_PageFactory(WebDriver driver2) {
		this.driver = driver2;
	}
	
	public void enterusername(String username1)
	{
		username.sendKeys(username1);
	}
	public void enterpassword(String password1)
	{
		password.sendKeys(password1);
	}
	
	public void clickonlogin()
	{
		loginbutton.click();
	}
}
