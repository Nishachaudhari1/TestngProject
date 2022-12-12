package programStringArray;

import java.util.HashSet;

public class HashsetProgram {

public static void main(String []arg) {
	
	String a="ramaramaram" ;
	char [] ch=a.toCharArray();
	
	HashSet<Character> obj= new HashSet<Character> ();
	for  ( char k:ch){
		obj.add(k);
}
	System.out.println(obj);
	}
}
	

