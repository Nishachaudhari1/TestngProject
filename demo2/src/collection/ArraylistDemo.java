package collection;

import java.util.ArrayList;

public class ArraylistDemo {
	//list=interface
	//Arraylist=class
	
	public static void main(String [] arg) {
		
	ArrayList<Integer >obj = new ArrayList<Integer> (); 
	obj.add(10);
	obj.add(20);
	obj.add(30);
	obj.add(40);
	obj.add(20);
	System.out.println(obj.size());
	obj.add(4,90);  
	System.out.println(obj);
	
	System.out.println(obj.get(2));
	for (int i=0;i<obj.size();i++) {
	
		obj.set(2,70);  //replace
		System.out.println(obj);
	System.out.println(obj.get(i));}
	
	for(int j:obj){
	System.out.println(j);	
	}
}	
}