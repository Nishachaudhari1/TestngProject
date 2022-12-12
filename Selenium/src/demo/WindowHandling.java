package demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

public static void main (String [] arg) {
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\baps\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

	
    WebDriver driver = new ChromeDriver ();

	   driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	   
	   driver.findElement(By.xpath("//button[@id=\"openwindow\"]")).click();
	
	System.out.println (driver.getCurrentUrl());
	  
	  Set<String> obj=driver.getWindowHandles();
	  
	   Iterator <String> it= obj.iterator();
	   String ParentWindow= it.next();
	   String childWindow=it.next();
	   
	   driver.switchTo ().window(childWindow);
	  System.out.println((driver.getCurrentUrl()));
	   
	   driver.switchTo().window(ParentWindow);
	   System.out.println(driver.getCurrentUrl());

}
	
}
