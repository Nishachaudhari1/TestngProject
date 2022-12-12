package javaBasics;

public class StringOperations {

	public static void main (String [] args) {
	
	 String d="Nisha Chaudhari";
	 System.out.println(d);
	 
     //length of the string
	 int e=d.length();
	 System.out.println(e);
	 System.out.println(d.length());
  
	//convert string to UpperCase
	 String a=d.toUpperCase();
	 System.out.println(a.toUpperCase());
	 
    //convert string to LowerCase
	 String b=d.toLowerCase();
    System.out.println(b.toLowerCase());
	 
	//gives the character At specific position
    
	System.out.println(d.charAt(4));
	
	//concat operation
	d.concat("Hello");    //first way
	String s=d +("Hello");  //second way
	System.out.println(s. concat("Hello"));
	String j=d+" "+("Hello");
	System.out.println(j+" "); 
	 
	 String z="Hello";
	 String k="Nisha";
	 
	 System.out.println(z+" "+k);
	 
	//trim 
	 String f=" Hello + Nisha  ";
	 System.out.println(f.trim ());
	 
	 //blackslash character
	String w= "\"hello\" Nisha chaudhari";
	 System.out.println(w);
	 
	String m="\"hello @\" Nisha chaudhari";
	System.out.println(m); 
	
	//replace
	String q="Hello hi";
	System.out.println(q.replace("h", "k"));	
	
	 
}
}