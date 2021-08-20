//Assignment 18 [Program 2 ] [Reverse all elements and place it in a reverse order] DATE: 08/20
package deepak.Assignment_18;

import java.util.Arrays;

public class ReverseArray2 {
	
	String reverseString(String str){
		String str1="";
		for(int index=str.length()-1;index>=0;index--){
			str1=str1+str.charAt(index);
		}
		return str1;
	}
	
	String[] reverseArray(String[] input){
		String[] output=new String[input.length];
		int temp=input.length-1;
		for(int index=0;index<input.length;index++) {
			String rev=	reverseString(input[index]);
			input[index]=rev;
			output[temp]=input[index];
			temp--;
		}
		return output;
	}
	
	public static void main(String[] args) {
		ReverseArray2 obj=new ReverseArray2();
		System.out.print("Reverse of the input string is: ");
		System.out.println(obj.reverseString("Hello World"));
		
		String[] input = {"madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav"};
		System.out.println("Reverse order of input string array is: ");
		System.out.println(Arrays.toString(obj.reverseArray(input)));
		}		
}


