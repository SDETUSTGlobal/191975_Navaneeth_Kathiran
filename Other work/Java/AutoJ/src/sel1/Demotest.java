package sel1;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demotest {
	
	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver","D://Software//SEL_JAR-20210901T092836Z-001//SEL_JAR//chromedriver_win32//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");		
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		driver.findElement(By.id("ctl00_MainContent_btnCheckAll")).click();
		driver.findElement(By.id("ctl00_MainContent_btnUncheckAll")).click();
		
	    driver.findElement(By.partialLinkText("products")).click();  
	    driver.findElement(By.linkText("Order")).click();  
	    Select dropdown = new Select(driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")));  
	    dropdown.selectByVisibleText("FamilyAlbum"); 
	    
	    driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity")).sendKeys("5");
	//	driver.findElement(By.className("btn-dark")).click();
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/table/tbody/tr/td/ol[1]/li[5]/input[2]")).click();
		
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtName")).sendKeys("Batman");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2")).sendKeys("Bruce Lane");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3")).sendKeys("Gotham");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4")).sendKeys("DC");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys("6000001");
		driver.findElement(By.cssSelector("#ctl00_MainContent_fmwOrder_cardList_1")).click();
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys("1111111111111");
		
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1")).sendKeys("09/22");
		//driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton")).click();
		driver.findElement(By.className("btn_light")).click();

		driver.findElement(By.partialLinkText("all orders")).click(); 
		//btnDeleteSelected

		String text= driver.findElement(By.tagName("td")).getText();
		System.out.println(text);
		
		
		//driver.quit();
				
	}

}
