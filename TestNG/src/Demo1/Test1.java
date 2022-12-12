package Demo1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test1 {

	@Test
	public void method1() {
		System.out.println("i am Method1 test1");
	
	}
		
		@Test
		public void method2 () {
			System.out.println("i am Method2 test1");
			
		}
			@BeforeSuite
			public void method3 () {
		 System.out.println("i am method3 test1 Before Suite");
			}
			
			@AfterSuite
			public void method4() {
		 System.out.println("i am method4 test1 after suite");
			}
		
}

