package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChekboxHandling {

	
	public static void main(String [] arg) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\baps\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
	     WebDriver driver = new ChromeDriver ();

	   driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	   
    WebElement b=  driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
     b.click();
    
   List < WebElement> a= driver.findElements(By.xpath("//input[@type='checkbox1']"));
   System.out.println(  a.size());
  
       for(int i=0 ;i<a.size(); i++) {
        a.get(i).click();
        
       }
    	   
       for(WebElement j:a) {
    	   j.click();
       }
     
       //Checkbox
     System.out.println( b.isDisplayed());//true
     System.out.println(b.isEnabled());  //True
     System.out.println(b.isSelected()); //

       WebElement l=driver.findElement(By.xpath("//input[@type='radio']"));
      l.click();
       
       
       List<WebElement> k=driver.findElements(By.xpath("//input=[@type='radio']"));
      
       for(int p=0; p<k.size(); p++) {
      k.get(p).click();
      
       }
      // for(WebElement e:k) {
    	//  e.click();
       }
       }   
	

