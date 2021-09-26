/*Assignment - 18 : 19th Aug'21
Program 2 : Reverse all elements and place it in a reverse order

String[] input = {"techno", "credits", "krishna","harsh"}
output : [hsrah, anhsirk, stiderc, onhcet]

Note : use sop(Arrays.toString(output)) to print the array content.*/

package ritabrata;

import java.util.Arrays;

public class ReverseStringReverseOrder {
	
	String[] getReverseArrayReverseOrder(String[] arr) {
		ReverseAllStringSameOrder string= new ReverseAllStringSameOrder();
		String[] output= new String[arr.length];
		int n = arr.length-1;
		for(int index=0;index<arr.length;  index++) {
			String rev= string.getReverseStringSameOrder(arr[n]);
			output[index]=rev;
			n--;
		}
		System.out.println("The reverse elements in the reverse order: "+Arrays.toString(output));
		return output;
		
	}
	public static void main(String[] args) {
		ReverseStringReverseOrder stringR= new ReverseStringReverseOrder();
		String[] ip= {"techno", "credits", "krishna","harsh"};
		stringR.getReverseArrayReverseOrder(ip);
		String[] example= {"madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav"};
		stringR.getReverseArrayReverseOrder(example);
	}
}
