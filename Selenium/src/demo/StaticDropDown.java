package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

public static void main(String [] arg) throws InterruptedException	 {
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\baps\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

    WebDriver driver = new ChromeDriver ();

    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
    
    WebElement a = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
    Select s= new Select (a);
    
   s.selectByIndex(1);
   s.selectByValue("AED");
   s.selectByVisibleText("USD");
   
   driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
   
   for(int i=0; i<9; i++ ) {

	   Thread.sleep(3000);
    driver.findElement(By.xpath("	//span[@id='hrefIncAdt'] ")).click();
   
    System.out.println(driver.switchTo().alert().getText());
   
   

   }
}
	
	
}
