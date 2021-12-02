package sel1;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demofire {
	
	public static void main(String[] args){
		
		System.setProperty("webdriver.Firefox.driver","D://Software//SEL_JAR-20210901T092836Z-001//SEL_JAR//geckodriver-v0.29.1-win64//geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("IPhone");
		
		driver.findElement(By.id("nav-search-submit-text")).click();
		
		driver.close();
	}

}
