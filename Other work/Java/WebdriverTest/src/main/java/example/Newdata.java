package example;


import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;	

public class Newdata{
@Test(dataProvider="testdata")
public void demoClass(String username, String password) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D://UST//work//AutoJ//chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
driver.findElement(By.className("button")).click();
Thread.sleep(5000);
AssertJUnit.assertTrue(driver.getTitle().matches("Web Orders"), "valid credentials");
System.out.println("Login successful");
}

/*@AfterMethod
void ProgramTermination() {
	driver.quit();
} */

@Test
@DataProvider(name="testdata")
public Object[][] testDataExample(){
NewExcel configuration = new NewExcel("D://UST//Eclipse//Book1.xlsx");
int rows = configuration.getRowCount(0);
Object[][]signin_credentials = new Object[rows][2];

for(int i=0;i<rows;i++)
{
signin_credentials[i][0] = configuration.getData(0, i, 0);
signin_credentials[i][1] = configuration.getData(0, i, 1);
}
return signin_credentials;
}
}
