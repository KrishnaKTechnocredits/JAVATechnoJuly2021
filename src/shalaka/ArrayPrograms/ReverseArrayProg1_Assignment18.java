/*Assignment - 18 : 19th Aug'21

Program 1 : Reverse all elements of an array at same position  
String[] input = {"madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav"};
output : [ivhdam, ihbrus, ahen, hsednas, tikna, vahbiav]

Note : you can print array content directly using sop(Arrays.toString(output)); toString() method of Arrays class return String. 

Method should take String array and return String array.

Program 2 : Reverse all elements and place it in a reverse order

String[] input = {"techno", "credits", "krishna","harsh"}
output : [hsrah, anhsirk, stiderc, onhcet]

Note : use sop(Arrays.toString(output)) to print the array content.*/


package shalaka.arrayprograms;

import java.util.Arrays;

public class ReverseArrayProg1_Assignment18 {
	String getReveseString (String input) {
		String output = "";
		for(int index=input.length()-1;index>=0;index--) {
			output+=input.charAt(index);
		}
		return output;
	}
	
	String[] getReverseStringArray(String [] input) {
		String [] output = new String[input.length];
		for(int index=0; index<input.length;index++) {
			output[index]=getReveseString(input[index]);
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseArrayProg1_Assignment18 reverseArray_Assignment18 = new ReverseArrayProg1_Assignment18();
		String[] input = {"madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav"};
		String[] output=reverseArray_Assignment18.getReverseStringArray(input);
		System.out.println("output:"+Arrays.toString(output));
	}

}
