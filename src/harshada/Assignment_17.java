/*
 Assignment - 17 : 18th Aug'2021
Write a method which takes one String parameter and return a reverse String.

Hint : String getReverseString(String input){

return output;
}

input : technocredits
output : stiderconhcet
 */

package harshada;

import java.util.Arrays;
public class Assignment_17 {
	
	
	String getReverseString(String input) {
		
		String tempInput=" ";
		for(int index=input.length()-1 ; index>=0; index--) {
			tempInput = tempInput + input.charAt(index);
		}
		
		return tempInput;
	}
	
	public static void main(String a[]) {
		Assignment_17 assignment_17=new Assignment_17();
		String input="Technocredits ";
		String input2=assignment_17.getReverseString(input);
		System.out.println("Reverse String Is:");
		System.out.println(input2);
		
	}
	
}
