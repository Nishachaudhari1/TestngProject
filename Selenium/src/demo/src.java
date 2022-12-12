package demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class src {

	public static void main(String [] arg) throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\baps\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

	     WebDriver driver = new ChromeDriver ();

	     driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	     File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	     FileUtils.copyFile(src, new File("C:\\Users\\baps\\Desktop\\Selenium jar\\Test1.png"));
	}
}
