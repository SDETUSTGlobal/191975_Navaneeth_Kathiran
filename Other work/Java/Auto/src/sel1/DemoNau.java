package sel1;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoNau {
	
	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver","D://Software//SEL_JAR-20210901T092836Z-001//SEL_JAR//chromedriver_win32//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.naukri.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("qsb-keyword-sugg")).sendKeys("Microsoft");
		driver.findElement(By.id("qsb-location-sugg")).sendKeys("Banglore");		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/form/div[3]/button")).click();
		driver.findElement(By.xpath("/html/body/div[3]/span[1]")).click();
		
		//driver.quit();
				
	}

}
