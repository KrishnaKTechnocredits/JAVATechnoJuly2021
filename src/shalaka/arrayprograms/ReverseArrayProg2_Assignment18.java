package shalaka.ArrayPrograms;

import java.util.Arrays;

public class ReverseArrayProg2_Assignment18 {
	
		String getReveseString (String input) {
			String output = "";
			for(int index=input.length()-1;index>=0;index--) {
				output+=input.charAt(index);
			}
			return output;
		}
		
		String[] getReverseStringArray(String [] input) {
			String [] output = new String[input.length];
			int count=0;
			for(int index=input.length-1; index>=0;index--) {
				output[count]=getReveseString(input[index]);
				count++;
			}
			return output;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ReverseArrayProg2_Assignment18 reverseArray_Assignment18 = new ReverseArrayProg2_Assignment18();
			String[] input = {"techno", "credits", "krishna","harsh"};
			String[] output=reverseArray_Assignment18.getReverseStringArray(input);
			System.out.println("output:"+Arrays.toString(output));
		}

	}
