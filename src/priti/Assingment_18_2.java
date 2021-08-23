package priti;

import java.util.Arrays;

public class Assingment_18_2 {

	String getReverseString(String str) {
		String output =  "";
		for (int index=str.length()-1;index>=0; index--) {
			output = output+str.charAt(index);
		}return output;
	}	
	
	String[] reverStringArray(String[] input) {
	
		for (int index=input.length-1; index>=0; index--) {
			input[index] = getReverseString(input[index]);
		}return input ; //output;
	}	
		
	
	public static void main(String[] a) {
		String[] input = {"techno", "credits", "krishna","harsh"};
		Assingment_18_2 assingment_18_2 = new Assingment_18_2();
		String [] revinput= assingment_18_2.reverStringArray(input);
		for (int index=input.length-1; index>=0; index--) //please review this logic is it correct? 
			System.out.println(revinput[index]);//Reverse all elements og given aary and place it in a reverse order

		}		
		
	}
	

	
