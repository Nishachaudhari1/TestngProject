package Demo1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametrizationDemo {

	@Test
	@Parameters({"Username","password"})
	public void method(String username,String password) {
		System.out.println("Username");
		System.out.println("password");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
