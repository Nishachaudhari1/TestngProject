package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nesttedframe {

	
	public static void main(String [] arg) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\baps\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

	     WebDriver driver = new ChromeDriver ();

	     driver.get("https://demoqa.com/nestedframes");
	     
	     WebElement parentframe=driver.findElement(By.xpath("//iframe[@id='frame1']"));
	     
	    
		driver.switchTo().frame(parentframe);
	     
	    System.out.println( driver.findElement(By.xpath("//body[contains (text(),'Parent frame')]")).getText());
	     
	     WebElement childframe=driver.findElement(By.xpath("//iframe[@srcdoc=\"<p>Child Iframe</p>\"]"));
	     driver.switchTo().frame(childframe);
	     
	   System.out.println(   driver.findElement(By.xpath("//p[contains (text(),'')]")).getText());
	   
	}
}
