package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumlocators {

	
	public static void main(String [] arg) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\baps\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

	     WebDriver driver = new ChromeDriver ();

	     driver.get("https://login.salesforce.com/");

       // driver.findElement(By.id("username")).sendKeys("test1");
      //  driver.findElement(By.name("pw")).sendKeys("test123");
        
    //    driver.findElement(By.id("login")).click();
        
        Thread.sleep(2000);
    //   driver.findElement(By.linkText("Forgot Your Password?")).click();
     Thread.sleep(3000);  
    //   driver.findElement(By.partialLinkText("Use Custom")).click();
       
       
       
       
       
       
       
       
       
       
       
       
	}
}
