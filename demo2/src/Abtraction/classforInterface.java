 package Abtraction;

public class classforInterface  implements Interface{

	@Override
	public void method() {
		System.out.println("hello");
		
	}

	@Override
	public void method1() {
		System.out.println("bye");
		
	}


public static  void main (String [] arg ) {
	
	classforInterface obj =new classforInterface ();
	obj.method();
	obj.method1();
}

		
	

		
	}
