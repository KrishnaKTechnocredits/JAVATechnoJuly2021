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

package sagar_Anasane;

import java.util.Arrays;

public class Assignment18 {
	
	String reverseString(String input) {
		String output ="";
		int length = input.length();
		for (int index = length-1;index>=0;index --) {
			output = output + input.charAt(index);
		}
		return output;	
	}
	
	String[] reverseStringArrayAtSamePosition(String[] input) {
		String[] output = new String[input.length];
		for(int index = 0; index < input.length; index ++) {
			output[index] = reverseString(input[index]);
			
		}
		return output;
		
	}
	
	String[] reverseStringInReverseOrder(String[] input) {
		String[] output = new String[input.length];
		int cnt = input.length-1;
		for (int index =0;index<=input.length-1;index ++) {
			output[index] = reverseString(input[cnt]);
			cnt--;	
		}
		return output;	
	}
	
	void displayArray(String[] output){
		System.out.println(Arrays.toString(output));
	}
	
	public static void main(String[] args) {
		Assignment18 assignment18 = new Assignment18();
		String[] input1 = {"madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav"};
		String[] input2 = {"techno", "credits", "krishna","harsh"};
		String[] output1= assignment18.reverseStringArrayAtSamePosition(input1);
		System.out.println("Elements of array at same position :");
		assignment18.displayArray(output1);
		String[] output2 = assignment18.reverseStringInReverseOrder(input2);
		System.out.println("\n"+"Elements of array in reverse order :");
		assignment18.displayArray(output2);
		}
		
	}

