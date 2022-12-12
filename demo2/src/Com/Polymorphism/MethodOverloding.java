package Com.Polymorphism;

public class MethodOverloding {

	
	public void addition(int a ,int B) {
		System.out.println(a+B);
	}	
		public void addition(double a,double B) {
		System.out.println(a+B);	
		}

public static void main(String [] arg) {
	 
	MethodOverloding obj = new MethodOverloding() ;
	obj.addition(10,5);
	obj.addition(3.8,4.4);
}
}