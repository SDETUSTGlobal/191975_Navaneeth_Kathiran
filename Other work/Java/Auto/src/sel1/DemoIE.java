package sel1;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.edge.EdgeDriver;

public class DemoIE {
	
	public static void main(String[] args){
		
		System.setProperty("webdriver.edge.driver","D://Software//SEL_JAR-20210901T092836Z-001//SEL_JAR//IEDriverServer_x64_3.150.1//IEDriverServer.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.navigate().to("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("New");
		
		driver.findElement(By.id("nav-search-submit-text")).click();
		
		driver.close();
	}

}
