package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo {

	public static void main(String [] arg) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\baps\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

	     WebDriver driver = new ChromeDriver ();


		   driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		   
		   Actions a=  new Actions(driver);
		
		   WebElement b=driver.findElement(By.xpath("//button[@id='openwindow']"));
		   
		// a.doubleClick(b).perform();
		 
		 //a.contextClick().perform();
	
		 WebElement c =driver.findElement(By.xpath("//button[@id='mousehover']"));
		 a.moveToElement(c).perform();
		 
	
	}

	}


