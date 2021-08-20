//Assignment 18 [Program 1 ] [Reverse all the elements of an arrray at same position] DATE: 08/20
package deepak.Assignment_18;

import java.util.Arrays;

public class ReverseArray {
	
	String reverseString(String str){
		String str1="";
		for(int index=str.length()-1;index>=0;index--){
			str1=str1+str.charAt(index);
		}
		return str1;
	}
	
	String[] reverseArray(String[] input){
		for(int index=0;index<input.length;index++) {
			String rev=	reverseString(input[index]);
			input[index]=rev;
		}return input;
	}
	
	public static void main(String[] args) {
		ReverseArray obj=new ReverseArray();
		System.out.print("Reverse of the string is: ");
		System.out.println(obj.reverseString("Hello World"));
		String[] input = {"madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav"};
		obj.reverseArray(input);
		System.out.println("Reverse of the each string in an array is: "); 
		System.out.println(Arrays.toString(input));
		}		
}


