package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

public static void main(String [] arg) throws InterruptedException	{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\baps\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

    WebDriver driver = new ChromeDriver ();

    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    JavascriptExecutor obj=    (JavascriptExecutor)driver;
    
    WebElement a=driver.findElement(By.xpath("//a[@class='btn-style class1 class2']"));
    obj.executeScript("Argument[0],ScrollInterview()",(a));
    
    
    a.click();
}


}
