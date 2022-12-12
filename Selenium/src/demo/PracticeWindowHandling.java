package demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeWindowHandling {

	public static void main(String [] arg) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\baps\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

	     WebDriver driver = new ChromeDriver ();

	     driver.get("https://www.naukri.com/");
	
	     System.out.println(driver.getCurrentUrl());

	     
	 

		    driver.findElement(By.xpath("//div[contains(text (),'Services')]")).click();

	   	     Set<String> obj =driver.getWindowHandles();
  
	     
	     Iterator<String> it=obj.iterator();
	   
	     String ParentWindow=it.next();
	     String childWindow=it.next();

	 
		   driver.findElement(By.xpath("//a[@class='ntc__chip-wrapper']")).click();
		    

	   Thread.sleep(2000);
	   
   
	    System.out.println (driver.getCurrentUrl());
  	     Set<String> obj1 =driver.getWindowHandles();
	     Iterator<String> it1=obj.iterator();
	     driver.switchTo().window(childWindow);

	  
		    driver.findElement(By.xpath("//div[contains(text (),'Services')]")).click();
		    String grandfatherWindow=it.next();

    driver.switchTo().window(grandfatherWindow);
    System.out.println (driver.getCurrentUrl());

    driver.switchTo().window(ParentWindow);
    System.out.println(driver.getCurrentUrl());
	}
}
