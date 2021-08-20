/* 
Assignment - 18 : 19th Aug'21

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
package harshada;

import java.util.Arrays;

public class Assignment_18 {
	
	String reverseString (String input) {
		String output= " ";
		for(int index=input.length() - 1 ; index>=0; index--) {
			output = output + input.charAt(index);
		}
		return output;
	}
	
	String[] reverseElementsOfArraySamePosition(String input[]) {
		//String output[]=new String[input.length];
		for(int index=0; index<input.length; index++) {
			input[index]=reverseString(input[index]);
			//System.out.println(tempStr);	
		}
		return input;
	}
		
		public static void main(String a[] ) {
			Assignment_18 assignment_18=new Assignment_18();
			String[] inputStr = {"madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav"};
			String outputStr[] = assignment_18.reverseElementsOfArraySamePosition(inputStr);
			System.out.println("Reverse String Array contents are :");
			System.out.println(Arrays.toString(outputStr));
			
		}
		

	}
	
