package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pacticepagenesttedframe {

	public static void main(String [] arg) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\baps\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver ();

		driver. get("https://the-internet.herokuapp.com/nested_frames");
		
		WebElement LEFTframe=driver.findElement(By.xpath("//frame[@src='/frame_left']\r\n" ));
		
		driver.switchTo().frame(LEFTframe);
System.out.println(driver.findElement(By.xpath("//body[contains(text(),'LEFT')]")).getText());
		

		
		
		
	}
}
