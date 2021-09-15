package aniket;

import java.util.Arrays;

public class Assignment_26_2 {
	String[] getrReverseArrayString(String[] input) {
		  String[] output =new String[input.length];
		  int i=0;
		  for(int index=input.length-1;index>=0;index--) {
			  output[i]=input[index];
			  i++;			  
		  }
		  return output;		
		
	}

	public static void main(String[] args) {
		String[] str = { "Credits", "Techno", "From", "Diwali", "Happy" };
		Assignment_26_2 assignment_26_2 = new Assignment_26_2();
		String[] output = assignment_26_2.getrReverseArrayString(str);
		System.out.println("Reverse string arrray is : "+ Arrays.toString(output));
	}
}
