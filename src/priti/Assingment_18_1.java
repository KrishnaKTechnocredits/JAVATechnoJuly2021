package priti;

import java.util.Arrays;

public class Assingment_18_1 {

	String getReverseString(String str) {
		String output =  "";
		for (int index=str.length()-1;index>=0; index--) {
			output = output+str.charAt(index);
		}return output;
	}	
	
	String[] reverStringArray(String[] input) {
		//String[] output = new String [input.length];idon't wan to create an extra array, capture ouput in input array only
		for (int index=0; index<input.length; index++) {
			//output[index] = getReverseString(input[index]);
			input[index] = getReverseString(input[index]);
		}return input ; //output;
	}	
		
	
	public static void main(String[] a) {
		String[] input = {"techno", "credits", "krishna","harsh"};
		//String [] input = {"madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav"};
		Assingment_18_1 assingment_18_1 = new Assingment_18_1();
		//String [] arr= assingment_18_1.reverStringArray(input);
		
		String [] revinput= assingment_18_1.reverStringArray(input);
		//we have to write a loop to to get output in to the array
		
		//for (int index=0; index<arr.length; index++) {
			//System.out.println(arr[index]);
		System.out.println(Arrays.toString(revinput));
		//}
		
		//System.out.println(input); 
		
		//System.out.println(revinput);ouput is capture in same array
	}
}	
		

	
