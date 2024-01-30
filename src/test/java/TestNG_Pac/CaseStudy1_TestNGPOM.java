package TestNG_Pac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CaseStudy1_TestNGPOM {
   WebDriver driver;
   
   By fname = By.name("firstname");
   By lname = By.name("lastname");
   By email = By.name("email");
   By pword = By.xpath("//*[@id=\"password\"]");
   By cpword = By.xpath("//*[@id=\"password-confirmation\"]");
   By loginbutton = By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button/span");
   By dashboard = By.xpath("//*[@id=\"maincontent\"]/div[2]/div[1]/div[1]/h1/span");
   
   public CaseStudy1_TestNGPOM(WebDriver driver2) {
		this.driver = driver2;
	}
   public boolean verifyfirstname()
	{
		boolean isfirstname_displayed=driver.findElement(fname).isDisplayed();
		return isfirstname_displayed;	
	}	
	public boolean verifylastname()
	{
		boolean islastname_displayed=driver.findElement(lname).isDisplayed();
		return islastname_displayed;
	}
	public boolean verifyemail()
	{
		boolean isemail_displayed=driver.findElement(email).isDisplayed();
		return isemail_displayed;
	}
	public boolean verifypassword()
	{
		boolean ispassword_displayed=driver.findElement(pword).isDisplayed();
		return ispassword_displayed;
	}
	public boolean verifyconfirmpassword()
	{
		boolean isconfirmpassword_displayed=driver.findElement(cpword).isDisplayed();
		return isconfirmpassword_displayed;
	}
	public boolean clicklogin()
	{
		boolean islogin_displayed=driver.findElement(loginbutton).isDisplayed();
		return islogin_displayed;
	}
	public boolean verifylogin()
	{boolean isdashboard_displayed;
		try
		{
		 isdashboard_displayed=driver.findElement(dashboard).isDisplayed();
		}
		catch(Exception e)
		{
			isdashboard_displayed=false;
		}
		
		return isdashboard_displayed;
	}
	public void fname(String fname2) {
		driver.findElement(fname).sendKeys(fname2);
 }
	public void lname(String lname2) {
		driver.findElement(lname).sendKeys(lname2);
	}
	public void email(String email2) {
		driver.findElement(email).sendKeys(email2);
		
	}
	public void pword(String pword2) {
		driver.findElement(pword).sendKeys(pword2);
 }
	public void cpword(String cpword2) {
		driver.findElement(cpword).sendKeys(cpword2);
 }
	public void clicklogin1() {
		driver.findElement(loginbutton).click();
 }
}
