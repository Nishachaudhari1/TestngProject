package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaits {

	//synchronization in selenium
	public static void main(String  [] arg) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\baps\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

	     WebDriver driver = new ChromeDriver ();
	   
	     driver.get("https://mvnrepository.com/artifact/commons-io/commons-io/2.4)");
	     //implicitWait
	    driver. manage().timeouts().implicitlyWait(Duration.ofSeconds (5));
	     
	     
	    //ExplicitWait
	     WebDriverWait wait= new WebDriverWait (driver,Duration.ofSeconds(5));
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(null)));
	}
}
