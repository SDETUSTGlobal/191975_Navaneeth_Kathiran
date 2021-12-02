package sel1;
import java.util.List;

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testops {
	
	public static void main(String[] args){
		
    	System.setProperty("webdriver.chrome.driver","D://UST//work//AutoJ//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");		
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();

	   WebElement element = driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/div[3]/table/tbody"));
	   
	   List rows = driver.findElements(By.xpath("//*[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
	 
		int count1=0,count2=0;
		System.out.println(element.getText());
		if(element.getText().contains("MyMoney") && element.getText().contains("MasterCard") )
		{
			count1++;
		}
		if(element.getText().contains("FamilyAlbum") && element.getText().contains("Canada") )
		{
			count2++;
		}
	
		
		System.out.println("Canada and Family Album : "+count2);
		System.out.println("MyMoney and MasterCard : "+count1);


		driver.quit();
				
	}

}
