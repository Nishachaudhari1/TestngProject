package Demo2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test2 {

	
	@Test
	public  void method1 () {
		System.out.println("i am method1 test2");
		
	}	
		@BeforeClass
		public void method2() {
			System.out.println("i am method2 test2 @BeforeClass");
		}	
			@AfterClass
			public void method() {
			System.out.println("i am method3 test2 @AfterClass");
			}
	
}
