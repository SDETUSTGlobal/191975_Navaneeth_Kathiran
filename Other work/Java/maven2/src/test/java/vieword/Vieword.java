
/*Step definition for view all oders page*/

package vieword;  
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;  
import cucumber.annotation.en.Given;  
import cucumber.annotation.en.Then;  
import cucumber.annotation.en.When; 
   
public class Vieword {
WebDriver driver= null;
  @Given("^I am on List of all orders page$")  
  public void goToListofallOrders() {  
  driver= new ChromeDriver();
  driver.navigate().to("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Default.aspx");
   
   
  driver.findElement(By.linkText("View all orders")).click();
  }  
     
  @When("^I click on Check all button$")  
  public void checkAll(){  
  driver.findElement(By.id("ctl00_MainContent_btnCheckAll")).click();    
  }  
     
  @Then("^all products must be selected$")  
  public void productsareSelected() { 
     if(driver.getTitle().equalsIgnoreCase("Web Orders")){  
      System.out.println("Test Pass");  
   } else {  
      System.out.println("Test Failed"); 
   }
   }  
  
     
  @When("^I click on Uncheck all button$")  
  public void uncheckAll(){  
  driver.findElement(By.id("ctl00_MainContent_btnUncheckAll")).click();    
  }  
     
  @Then("^all products must be deselected$")  
  public void productsareDeselected() { 
     if(driver.getTitle().equalsIgnoreCase("Web Orders")){  
      System.out.println("Test Pass");  
   } else {  
      System.out.println("Test Failed");  }
   }  

   
  @When("^I click on Checkbox$")  
  public void checkBox(){  
  driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl02_OrderSelector")).click();    
  }  
     
  @Then("^Particular products must be selected$")  
  public void CheckboxSelected() { 
     if(driver.getTitle().equalsIgnoreCase("Web Orders")){  
      System.out.println("Test Pass");  
   } else {  
      System.out.println("Test Failed");  }
   }  
 
  
   @When("^I click on delect selected button$")  
  public void delectSelect(){  
  driver.findElement(By.id("ctl00$MainContent$btnDelete")).click();    
  }  
     
  @Then("^Particular products must be deleted$")  
  public void itemDelete() { 
     if(driver.getTitle().equalsIgnoreCase("Web Orders")){  
      System.out.println("Test Pass");  
   } else {  
      System.out.println("Test Failed");  
   }  


   driver.close();  
   
}


}