package Demo1;

import org.testng.annotations.Test;

public class DependonMethods {

	@Test (dependsOnMethods= {"method2","method3"})
	public void method1() {
	System.out.println("method1");
	}
	@Test
	public void method2() {
	System.out.println("method2");
	
	}
	@Test
	public void method3 () {
	System.out.println("method3");
	}
}
