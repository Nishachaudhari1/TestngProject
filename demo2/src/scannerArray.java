
import java.util.Arrays;
import java.util.Scanner;

public class scannerArray {




public static void main (String [] arg) {
	
	Scanner obj = new Scanner (System.in) ;
	int ar [] =new int [5];  //First Aaraydeclear
	ar[0]= obj.nextInt(); //secondarraylist
	ar[1]=obj.nextInt();
	ar[2]=obj.nextInt();
	ar[3] =obj.nextInt();
	ar[4]=obj.nextInt();
	System.out.println(Arrays.toString(ar));
}







}
