package test4;

public class typecasting {
	
 public static void main (String [] args) {
	 
	 int a=20;
	 float b=(a);
	 
	 System.out.println(a);
	 System.out.println(b);
	 
	 byte c=50; 
	 float f=(c);
	 
	 System.out.println(c);
	 System.out.println(f);
	 
	 float d=4.9f;
	 double e=(d);
	 
	 System.out.println(d);
	 System.out.println(e);
	 
	 int h=70;
	 long j=(h);
	 
	 System.out.println(h);
	 System.out.println(j);
	 
	 byte k=60;
	 int n=(k);
	 
	 System.out.println(k);
	 System.out.println(n);
	 
	 //narrowing casting
	 float s=80.0f;
	int v =(int)s;
	 
	 System.out.println(s);
	 System.out.println(v);
	 
	 char p='h';
	 int w = p;
	 System.out.println(p);
	 
}
}