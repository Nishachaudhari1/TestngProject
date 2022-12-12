package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DyanamicDropeDown {

public static void main(String [] args) throws InterruptedException	{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\baps\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

	
    WebDriver driver = new ChromeDriver ();
    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
  driver.findElement(By.xpath("//input[@autocomplete=off']")).click();
  driver.findElement(By.xpath("//a[@value='BOM']")).click();
  
  driver.findElement(By.xpath("//a[@value='Bom']"));
  Thread.sleep(2000);
  driver.findElement(By.xpath("//a[value='GOI']")).click();
}
	
	
}
