package javaBasics;

public class operators {

	public static void main (String [] args) {
	
	//Arithmetic operator
	//addition
		
	int a=10;	
	int b=40;	
	int c=a+b;
	System.out.println(c);
	
	//subtraction
	int d=45;
	int e=34;
	int f=d-e;
	System.out.println(f);
	
	//division
	int h=12;
	int j=3;
	int k=h/j;
	System.out.println(k);
	
	//multiplication
	int m=22;
	int n=12;
	int p=m*n;
	System.out.println(p);
	
	//modulus
	int i=24;
	int t=18;
	int u=i%t;
	System.out.println(u);
	
	//increment
	//Per-increment
	int v=35;
	System.out.println(++v);
	System.out.println(v);
	
	//post-increment
	int jk=42;
	System.out.println(jk++);
	System.out.println(jk);
	
	//pre-decrement
	int km=63;
	System.out.println(--km);
	System.out.println(km);
	
	//post-decrement
	int ph=67;
	System.out.println(ph--);
	System.out.println(ph);
	
	//assignment operatoar
	
	//comparision oprator <, >, <=, >=, ==
	
	int z=30;
	System.out.println(z==30);   //true
	System.out.println(z>30);   //false
	System.out.println(z<30);   //false
	System.out.println(z>=30);  //true
	System.out.println(z<=30);  //true
	System.out.println(z!=30);  //false
	
	//logical oprator
	//and &&
	//or ||	
	//not!
	int w=24;
	System.out.println(w<=45 && w>=15); //true
	System.out.println(w>12 || w>34);  //true
	System.out.println(w<10 && w<30); //false
	System.out.println(w<25 ||w>35); // true
	System.out.println(w<=12 || w<=16); //false
	System.out.println(!(w<=31|| w<=9)); //false
	System.out.println(!(w>4 || w>2));   //false
	
	
	
	
}
}