package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String [] arg) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\baps\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

	     WebDriver driver = new ChromeDriver ();

	     driver.get (" https://rahulshettyacademy.com/AutomationPractice/");
		
	     driver.findElement(By.xpath("[//input[@id='alertbtn']")).click();
	     Thread.sleep(2000);
		   System.out.println(  driver.switchTo().alert().getText());

	     driver.switchTo().alert().accept();
	     
	     //driver.switchTo().alert().dismiss();
	  
	}
}
