package Demo1;

import org.testng.annotations.Test;

public class PriorityPracticePage {

	
	@Test
	public void method1() {
	System.out.println("method1");	
	}
	@Test (priority=(-1) )
	public void method2() {
	System.out.println("method2");
	}
	
	@Test(priority=1)
	public void method3() {
	System.out.println("method3");
	}
}
