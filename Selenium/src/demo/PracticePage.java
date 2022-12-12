package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticePage {

	
	public static void main(String [] arg) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\baps\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

	     WebDriver driver = new ChromeDriver ();
	     driver.get("https://demoqa.com/frames");

	     driver.switchTo().frame(0);
	   System.out.println( driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText());
	     
	     
	  
	}
}
