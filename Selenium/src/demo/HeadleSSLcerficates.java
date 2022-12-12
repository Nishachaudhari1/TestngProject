package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadleSSLcerficates {

	public static void main(String [] arg) {
		   
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\baps\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		ChromeOptions option = new ChromeOptions();
		
		//to add argument
		
		option.setAcceptInsecureCerts(true);
		
		WebDriver driver=new ChromeDriver (option);
		
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		
	}
}
