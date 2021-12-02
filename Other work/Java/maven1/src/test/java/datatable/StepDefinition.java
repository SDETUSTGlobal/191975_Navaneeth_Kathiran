package datatable;   
import java.util.List;  
import org.openqa.selenium.By;   
import org.openqa.selenium.WebDriver;   
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;  
import cucumber.annotation.en.Given;   
import cucumber.annotation.en.Then;   
import cucumber.annotation.en.When;   
import cucumber.table.DataTable;  
public class StepDefinition {   
   WebDriver driver = null;  
   @Given("^I am on user registration page$")   
   public void goToLogin() {   
       
		driver.navigate().to("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
   }   
      
   @When("^I enter valid data on the page$")   
   public void enterData(){   
	   System.setProperty("webdriver.chrome.driver","D://Software//SEL_JAR-20210901T092836Z-001//SEL_JAR//chromedriver_win32//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");		
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		driver.findElement(By.id("ctl00_MainContent_btnCheckAll")).click();
		driver.findElement(By.id("ctl00_MainContent_btnUncheckAll")).click();
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

