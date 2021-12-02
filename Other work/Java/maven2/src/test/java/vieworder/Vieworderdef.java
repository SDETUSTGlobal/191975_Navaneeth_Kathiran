package vieworder;

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.annotation.en.And;
import cucumber.annotation.en.Given;   
import cucumber.annotation.en.Then;   
import cucumber.annotation.en.When;

public class Vieworderdef {
	WebDriver driver = null;  
	   @Given("^I am on the website page$")   
	   public void website() {   
		   System.setProperty("webdriver.chrome.driver","D://UST//work//chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.navigate().to("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/Default.aspx");
	   }
	   @When("^User clicks all$")   
	   public void enterData(){   
			driver.manage().window().maximize();
			driver.findElement(By.id("ctl00_MainContent_btnCheckAll")).click();

		}
	/*   @And("^User clicks uncheckall$")
	   @And("^User clicks uncheckall$")
	   @And("^User clicks uncheckall$")
	  */ 
	   
	   @Then("^User registration should be successful$")   
	   public void user_registration_should_be_successful() {if(driver.getCurrentUrl().equalsIgnoreCase("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Default.aspx")){  
	       System.out.println("Test Pass");   
	    } else {   
	       System.out.println("Test Failed");   
	    }   
	    driver.close();   
	   }
	 }   
