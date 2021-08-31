/*  
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

package arti_K.Assignment_18;
import java.util.Arrays;

public class ReverseArrayElementsInDiffWays2 {
	
	String doReverseString(String str) {
		String reverseString = " ";
		
		for(int index = str.length()-1; index >= 0; index--) {
			reverseString = reverseString + str.charAt(index);
		}
		return reverseString;
	}
	
	//Program 1 :
	void takeStringArrayOne(String[] arr) {
		System.out.println("\nPrinting all Reverse elements of an Array At SAME POSITION by creating new Array : ");
		
		for(int index = 0; index < arr.length; index++) {
			arr[index] = doReverseString(arr[index]);
		}
		System.out.println(Arrays.toString(arr));
	}
	
	//Program 2 :
	void takeStringArrayTwo(String[] arr1) {
		System.out.println("\nPrinting all Reverse elements of an Array IN a REVERSE ORDER by creating new Array : ");
		int count = 0;
		for(int index = arr1.length-1; index >= 0 ; index--) {
			arr1[count] = doReverseString(arr1[index]);
			count++;
		}
		System.out.print(Arrays.toString(arr1));
	}
	
	public static void main(String[] args) {
		String[] input = {"madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav"};
		String[] input1 = {"madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav"};
		
		System.out.println("Initial Array : {\"madhvi\", \"surbhi\", \"neha\", \"sandesh\", \"ankit\", \"vaibhav\"} ");
		
		ReverseArrayElementsInDiffWays2 rev = new ReverseArrayElementsInDiffWays2();
		
		rev.takeStringArrayOne(input);
		rev.takeStringArrayTwo(input1);
	}
}

