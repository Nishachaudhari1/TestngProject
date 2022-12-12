package Com.Method;



public class Methods {

	

public  void method1(){
	 System.out.println(" this is method 1");
}
	 public static void method2() {
		System.out .println (" this is method2");
	 }
	  public static   int method3() {
		 int a=5;
		 return a;
	  }
		public  void method4() {
		int b=6;
		System.out.println(b);
		}
		
	                          	//Parameter
		public void method5(String name, int age) {
			System.out.println(name);
			System.out.println(age);
		}
		
		
		
		
		
public static void main(String[] args) {
    Methods obj =new Methods();
      obj.method1 ();
	 method2 ();
	 System.out.println(method3());
	obj. method4();
	             // argument
	obj.method5("rutuja",12);
	 }
	 
	 
	  
	 
	 
 
	
}


