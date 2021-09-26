package trupti;

import java.util.Arrays;

public class Assignment26_2 {
	
	public static void main(String[] args) {
		Assignment26_2 reverseArray=new Assignment26_2();
		String[] input= {"credits", "techno","from","diwali","happy"};
		System.out.println("input string:"+Arrays.toString(input));
		System.out.println("reverse string:"+Arrays.toString(reverseArray.getReverseArray(input)));
		
	}
	
	String[] getReverseArray(String[] input) {
		String[] output=new String[input.length];
		for(int index=0; index<input.length; index++) {
			output[index]=input[(input.length-1)-index];
		}
		return output;
	}
}
