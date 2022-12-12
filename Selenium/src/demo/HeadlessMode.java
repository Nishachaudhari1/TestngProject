package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessMode {
	
	public static void main(String [] arg) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\baps\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	
	ChromeOptions option=new ChromeOptions ()	;
	
		// add the headless argument
		option.addArguments("headless");
		
		
		WebDriver  driver=new ChromeDriver (option);
		
		driver.get("https://www.makemytrip.com/");
		
		System.out.println(driver.getCurrentUrl());
	
	
	
	
	
	
	
	
	
	
}	
}
