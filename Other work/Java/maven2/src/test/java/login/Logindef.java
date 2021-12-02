package login;

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.annotation.en.Given;   
import cucumber.annotation.en.Then;   
import cucumber.annotation.en.When;

public class Logindef {
	WebDriver driver = null;  
	   @Given("^I am on user registration page$")   
	   public void goToLogin() {   
		  // System.setProperty("webdriver.chrome.driver","D://UST//work//chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.navigate().to("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
	   }
	   @When("^I enter valid data on the page$")   
	   public void enterData(){   
			
			driver.manage().window().maximize();
			
			driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
			driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");		
			driver.findElement(By.id("ctl00_MainContent_login_button")).click();
	   }
	   @Then("^User registration should be successful$")   
	   public void user_registration_should_be_successful() {if(driver.getCurrentUrl().equalsIgnoreCase("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Default.aspx")){  
	       System.out.println("Test Pass");   
	    } else {   
	       System.out.println("Test Failed");   
	    }   
	    driver.close();   
	   }
	 }   
