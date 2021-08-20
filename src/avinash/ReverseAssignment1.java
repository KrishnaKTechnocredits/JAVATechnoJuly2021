package avinash;

/*Assignment - 18 : 19th Aug'21
Program 1 : Reverse all elements of an array at same position  
String[] input = {"madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav"};
output : [ivhdam, ihbrus, ahen, hsednas, tikna, vahbiav]
Note : you can print array content directly using sop(Arrays.toString(output)); toString() method of Arrays class return String. 
Method should take String array and return String array.*/


import java.util.Arrays;

public class ReverseAssignment1 {

	String getReverseString(String input) {
		String output="";
		for(int index=input.length()-1; index>=0; index--) {
			output+=input.charAt(index);
		}
		return output;
	}

	String[] getReverseStringArray(String[] array) {
		String[] output=new String[array.length];
		for(int index=0; index<array.length; index++) {
			output[index]=getReverseString(array[index]);
		}
		return output;
	}
	public static void main(String[] args) {
		String[] input = {"madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav"};
		ReverseAssignment1 reverseAssignment1 = new ReverseAssignment1();
		String[] output = reverseAssignment1.getReverseStringArray(input);
		System.out.println("Reverse all elements of an array " + Arrays.toString(input) + " at the same position- ");
		System.out.println("Output:- " + Arrays.toString(output));
	}
}
