package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameHandling {

	
	public static void main(String [] arg) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\baps\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\baps\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

	     WebDriver driver = new ChromeDriver ();

	     driver.get("https://jqueryui.com/droppable/");
	     
	    WebElement a= driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	     driver.switchTo().frame(a);
	     
	     Actions b=  new Actions ( driver);
	     
	     WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
	    
	     WebElement terget=driver.findElement(By.xpath("//div[@id='droppable']"));
	    
	   b.dragAndDrop(source,terget).build().perform();
	     
	    driver.switchTo().defaultContent();
	     
	      
	     
	   
	     
	     
	     
	     
	     
	     
	}
}
