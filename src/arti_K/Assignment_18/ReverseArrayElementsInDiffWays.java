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

public class ReverseArrayElementsInDiffWays {
	
	String doReverseString(String str) {
		String reverseString = " ";
		
		for(int index = str.length()-1; index >= 0; index--) {
			reverseString = reverseString + str.charAt(index);
		}
		return reverseString;
	}
	
	//Program 1 :
	String[] takeStringArrayOne(String[] arr) {
		
		String[] output = new String[arr.length];
		
		for(int index = 0; index < arr.length ; index++) {
			output[index] = doReverseString(arr[index]);
		}
		return output;
	}
	
	//Program 2 :
	String[] takeStringArrayTwo(String[] arr) {
		int count = 0;
		String[] output = new String[arr.length];
		
		for(int index = arr.length-1; index >= 0; index--) {
			output[count] = doReverseString(arr[index]);
			count++;
		}
		return output;
	}
	
	public static void main(String[] args) {
		String[] input = {"madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav"};
		
		System.out.println("Initial Array : {\"madhvi\", \"surbhi\", \"neha\", \"sandesh\", \"ankit\", \"vaibhav\"} ");
		
		ReverseArrayElementsInDiffWays rev = new ReverseArrayElementsInDiffWays();
		
		String[] ans = rev.takeStringArrayOne(input);
		
		System.out.println("\nPrinting all Reverse elements of an Array At SAME POSITION by creating new Array : ");
		
		for(int index = 0; index < ans.length; index++) {
			System.out.print(ans[index]+" ");
		}
		System.out.println("");
		
		String[] answer = rev.takeStringArrayTwo(input);
		
		System.out.println("\nPrinting all Reverse elements of an Array IN a REVERSE ORDER by creating new Array : ");
		
		for(int index = 0; index < answer.length; index++) {
			System.out.print(answer[index]+" ");
		}
	}
}
