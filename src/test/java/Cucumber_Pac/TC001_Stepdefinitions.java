package Cucumber_Pac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC001_Stepdefinitions {
	WebDriver driver;
	@Given("Launch the Chrome browser")
	public void launch_the_chrome_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    WebDriverManager.chromedriver().setup();	
	     driver= new ChromeDriver();
	}

	@When("user opens the url")
	public void user_opens_the_url() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@And("user enters the username and password")
	public void user_enters_the_username_and_password() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
	   
	   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
	}

	@And("Click on login button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	}

	@Then("Dashboard is displayed")
	public void dashboard_is_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
	   boolean dashboard= driver.findElement(By.xpath("//h6[normalize-space()='Dashboard']")).isDisplayed();
	   Thread.sleep(3000);
	   if(dashboard)
	   {
		   System.out.println("Login Successful");
	   }
	   else
	   {
		   System.out.println("Login not successful");
	   }
	}


}
