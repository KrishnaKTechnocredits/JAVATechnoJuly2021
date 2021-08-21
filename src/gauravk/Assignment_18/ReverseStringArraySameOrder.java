package gauravk.Assignment_18;

import java.util.Arrays;

/*
 * Assignment - 18 : 19th Aug'21

Program 1 : Reverse all elements of an array at same position  
String[] input = {"madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav"};
output : [ivhdam, ihbrus, ahen, hsednas, tikna, vahbiav]

Note : you can print array content directly using sop(Arrays.toString(output)); toString() method of Arrays class return String. 

Method should take String array and return String array.

Program 2 : Reverse all elements and place it in a reverse order

String[] input = {"techno", "credits", "krishna","harsh"}
output : [hsrah, anhsirk, stiderc, onhcet]

Note : use sop(Arrays.toString(output)) to print the array content.
 */
public class ReverseStringArraySameOrder {
	
	String reversingString(String str) {
		String str1 = "";
		for(int i=str.length()-1; i>=0; i--) {
			str1 += str.charAt(i);
		}
		return str1;
	}
	
	String[] reversingStringArrayElements(String[] arr1) {
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = reversingString(arr1[i]);
		}
		return arr1;
	}
	
	public static void main(String[] a) {
		String[] input = {"madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav"};
		String[] output = new ReverseStringArraySameOrder().reversingStringArrayElements(input);
		System.out.println("Reverse of all elements in the array"+Arrays.toString(input)+" in the same order is: \n"+Arrays.toString(output));
	}
}
