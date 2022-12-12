package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xapathandcssselector {

	public static void main(String [] arg) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\baps\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

	     WebDriver driver = new ChromeDriver ();

	     driver.get("https://login.salesforce.com/");

	 
	     driver.findElement(By.xpath("//input[@type='email']")).sendKeys("hello");
	  driver.findElement(By.id("//input[@type='password']")).sendKeys("123");
	   driver.findElement(By .id("//a[@id=forgot your password")).click();
	    
	    
	}
	
}
