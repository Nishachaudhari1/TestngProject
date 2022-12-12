package ExceptionHandling;

public class tryCatchBlock {

	public static void main(String [] args) {
		try {
	 int a[] = {10,20,30,40};
	 System.out.println(a[5]);
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("hello  I am exception");
		}
		System.out.println("hello123");
		}
	
	}

