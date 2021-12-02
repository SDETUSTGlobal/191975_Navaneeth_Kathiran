package suite1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Flipkart{
	

	WebDriver driver = new ChromeDriver();
	String username = "7902656594"; // Change to your username and passwrod
	String password = "vision16";

	// This method is to navigate flipkart URL
	@BeforeClass
	public void init() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.navigate().to("https://www.flipkart.com");
	}

	// To log in flipkart
	@Test
	public void login() {
		driver.findElement(
				By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys(username);
		driver.findElement(
				By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys(password);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")).click();
	}

	// Search For product
	@Test
	public void searchAndSelectProduct() {
		driver.findElement(By.cssSelector("#container > div > div._1kfTjk > div._1rH5Jn > div._2Xfa2_ > div._1cmsER > form > div > div > input")).sendKeys("redmi note 10");
		driver.findElement(
				By.cssSelector("#container > div > div._1kfTjk > div._1rH5Jn > div._2Xfa2_ > div._1cmsER > form > div > button > svg"))
				.click();

		// select the first item in the search results
		String css = "#container > div > div._36fx1h._6t1WkM._3HqJxg > div._1YokD2._2GoDe3 > div:nth-child(2) > div:nth-child(2) > div > div > div > a > div._3pLy-c.row > div.col.col-7-12 > div._4rR01T";
		driver.findElement(By.cssSelector(css)).click();
	}

	@Test
	public void buyAndRemoveFromCart() {
		driver.findElement(
				By.cssSelector("#container > div > div._2c7YLP.UtUXW0._6t1WkM._3HqJxg > div._1YokD2._2GoDe3 > div._1YokD2._3Mn1Gg.col-5-12._78xt5Y > div:nth-child(2) > div > ul > li:nth-child(2) > form > button"))
				.click();
		driver.findElement(By.cssSelector(".remove.fk-inline-block")).click();
		Alert a = driver.switchTo().alert();
		a.accept();
	}

	@Test
	public void logout() {
		Actions s = new Actions(driver);
		WebElement user = driver.findElement(By.partialLinkText(username));
		s.moveToElement(user).build().perform();
		driver.findElement(By.linkText("Logout")).click();
	}

	@AfterClass
	public void quit() {
		driver.close();
	}
}
