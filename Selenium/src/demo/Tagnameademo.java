package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagnameademo {

	public static void main(String [] arg){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\baps\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

	     WebDriver driver = new ChromeDriver ();

		driver.get("https://login.salesforce.com/?locale=in");
		List<WebElement> a=driver.findElements(By.tagName("a"));
		System.out.println(a.size());
		
		for(WebElement b:a) {
			System.out.println(b.getText());
		}
	}
}
