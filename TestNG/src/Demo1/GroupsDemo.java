package Demo1;

import org.testng.annotations.Test;

public class GroupsDemo {

	@Test(groups="Regrestion")
    public void method1()	{
	System.out.println("i am method 1");
}
	
	@Test
	public void method2() {
	System.out.println("i am method 2");
	}
	
	@Test(groups="Sanity")
	public void method3() {
	System.out.println("i am method 3");
	}
	
   @Test (groups= {"Regrestion","Sanity"} ) 
	public void method4() {
	 System.out.println("i am method4") ; 
   }
	
	
	
	
	
	
	
	
}
