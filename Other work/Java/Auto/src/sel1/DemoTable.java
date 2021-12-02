package sel1;
import java.text.ParseException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.text.NumberFormat;

import org.openqa.selenium.chrome.ChromeDriver;


public class DemoTable {

	public static void main(String[] args) throws ParseException
	
	{
		System.setProperty("webdriver.chrome.driver","D://Software//SEL_JAR-20210901T092836Z-001//SEL_JAR//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/web-table-element.php"); 
		driver.manage().window().maximize();
	    List  col = driver.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
	    System.out.println("No of cols are : " +col.size()); 
	    //No.of rows 
	    List  row = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]")); 
	    int rno = row.size();
	    System.out.println("No of rows are : " + rno);
	        

	    String Text = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[3]/td[4]")).getText();  
		System.out.println("Value of 3rd row 4th column :" +Text); 

		WebElement element = driver.findElement(By.xpath(".//*[@id='leftcontainer']/table/tbody"));
		System.out.println(element.getText());
		if (element.getText()=="Jet Airways"){
			
			String find = String.valueOf(element.findElement(By.xpath("//tr/td[4]")));
			System.out.println("found");

			System.out.println("Jet Airways"+find);
		}else {
			System.out.println("not found");

		}

	    
	    String finder;
	 	double flag=0,max=0;
	 	List  rows = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr")); 
	 	      
	 	      for(int i=1;i<rno;i++)
	 	      {
	 	    	 //String find= driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr["+String.valueOf(i)+"]/td[1]/a")).getText();  
	 	    	 
	 			//System.out.println("Value of Jet Airways :" +find); 
	 	
	 	    	  finder=driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr["+String.valueOf(i)+"]/td[4]")).getText();
	 			   flag=Double.parseDouble(finder);
	 	    	  if(flag>max){
	 	    		  max=flag;
	 	      }
	 	      }
	 	      System.out.println("Maximum value :"+max);
	      
	
		   
	        driver.quit();
	}
}