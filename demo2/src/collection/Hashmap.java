package collection;

import java.util.HashMap;

public class Hashmap {

// map=interface	
//Hashmap=class
	
	public static void main(String [] arg) {
	
		HashMap<String,String>obj=new HashMap<String,String> ();
		obj.put("mh", "mum");
		obj.put("KR","KRL");
		obj.put("Gujrat","Gandinager");
		obj.put("KR" ,"KRL");
		
		System.out.println(obj);
	System.out.println(obj.get("mh======="));

		obj.remove("kR");
	System.out.println("KR======");
	
	for(String k:obj.keySet()) {
	System.out.println(k);	}
	//valus
	
	System.out.println(obj.values());
	
	for(String k:obj.keySet()) {
	System.out.println(k+ " "+obj.get(k));   }
	}
	}
