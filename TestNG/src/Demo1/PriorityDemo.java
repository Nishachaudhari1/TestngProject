package Demo1;

import org.testng.annotations.Test;

public class PriorityDemo {

	
	@Test
	public void method() {
	System.out.println("method1");
}
	@Test(priority=1)
	public void mathod() {
   System.out.println("method2");
	}
	
	@Test
	public void amethod() {
	System.out.println("method3");
	}
}
	
	
	
	
	