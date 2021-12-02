package sel1;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;

public class Demogoogle {
	
	public static void main(String[] args){
		
    	System.setProperty("webdriver.chrome.driver","D://UST//work//AutoJ//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("New");
		
		driver.findElement(By.id("nav-search-submit-text")).click();
		
	}

}
