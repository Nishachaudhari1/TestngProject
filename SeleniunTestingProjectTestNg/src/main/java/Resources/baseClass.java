package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseClass {

	public WebDriver driver;
	public void browserInitilization() throws IOException {
		
		//to read the file properties
		FileInputStream obj= new FileInputStream ("C:\\Users\\baps\\eclipse-workspace\\SeleniunTestingProjectTestNg\\src\\main\\java\\Resources\\data.properties");
		
		
		//to access the properties file
		Properties prop= new Properties();
		prop.load(obj);
		
		String browsername=prop.getProperty("browser");
		if(browsername.equalsIgnoreCase("chrome")) {
			
	      driver=new ChromeDriver ();
	      
		}else if (browsername.equalsIgnoreCase("firefox")) {
			
		}else {
			
			System.out.println("please enter valid browser name");
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
