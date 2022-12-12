package Demo1;

import org.testng.annotations.Test;

public class DiffrentAnnotationDemo {

	@Test(enabled=false)
	public void method() {
	System.out.println("hello");
	}
	
	@Test (timeOut=5000)  //methodtimeOut
	public void method1() {
	System.out.println("i am method 1");
	}
	
	//suit time-out (time-out 2000);
	
	//this will run same test Multiple time with same data
	@Test(invocationCount=10)
	public void method2() {
	System.out.println("i am method4");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
