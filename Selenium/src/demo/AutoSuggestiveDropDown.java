package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropDown {

	public static void main(String [] arg) {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\baps\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

	     WebDriver driver = new ChromeDriver ();

	   driver.get ( "https://rahulshettyacademy.com/dropdownsPractise/");
	   
	   
	WebElement a=   driver.findElement(By.xpath("//input[@id='autosuggest']"));
	  a.sendKeys("ind") ;
	  
	  
	  List<WebElement> b=driver.findElements(By.xpath("//li[role='presentation']"));
	  for(int i=0; i<3; i++) {
		 if(b.get(i). getText().equalsIgnoreCase("india")) {
			 
		 
		 b.get(i).click();
		 break;
	  }
	   
	   
	   
	  }  
	   
	}
}
