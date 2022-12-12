package collection;

import java.util.HashSet;

public class HashsetDemo {

	//set-interface
	//hashset-class
	
	public static void main (String[]args) {
		
	HashSet<Integer> obj=new HashSet<Integer>();	   
	 
	obj.add(20);
	obj.add(80);
	obj.add(60);
	obj.add(90);
	obj.add(20);
	
	System.out.println(obj);
	
    obj.add(4);
	System.out.println(obj);
	obj.remove(60);
	System.out.println(obj);
	}
	
	
}
