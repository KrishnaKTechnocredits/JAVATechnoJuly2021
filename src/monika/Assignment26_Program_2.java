/*Program : 2 
reverse given string array.
input : {"Credits", "Techno","From","Diwali","Happy"}
output : {"Happy","Diwali","From","Techno","Credits"}
*/
package monika;

import java.util.Arrays;

public class Assignment26_Program_2 {
	
	String[] getreverseStringArray(String[] input) {
		String[] output = new String[input.length];
		for(int index=0;index<input.length;index++) {
			output[index] = input[(input.length-1)-index];
		}
		
		return output;
		
	}
	
	public static void main(String[] args) {
		Assignment26_Program_2 assignment26_Program_2=new Assignment26_Program_2();
		String[] input = {"Credits", "Techno","From","Diwali","Happy"};
		String[] stringReverse=assignment26_Program_2.getreverseStringArray(input);
		System.out.println("Given Array is :"+Arrays.toString(input));
		System.out.println("Reverse Array is: "+Arrays.toString(stringReverse));
	}
}
	

