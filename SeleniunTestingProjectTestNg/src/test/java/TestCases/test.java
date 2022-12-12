package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import Resources.baseClass;

public class test extends baseClass{
	
	@Test
	public void method1() throws IOException {
	
		browserInitilization();
		
		driver.get("https://login.salesforce.com/");
		
	}
	
	
}
