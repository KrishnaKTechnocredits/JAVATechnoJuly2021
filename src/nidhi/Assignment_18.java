package nidhi;

import java.util.Arrays; 
class Assignment_18{
 
	
	String[] getReverseArray(String[] input){
		String output[]= new String[input.length];
		for (int i=0; i < input.length;i++){
			output[i] = getReverseString(input[i]);
		}
		
	return output;
	}
	
	String[] getReverseStringArray(String[] input){
		String output[]= new String[input.length];
		for (int i=0; i < input.length;i++){
			output[input.length - 1 - i] = getReverseString(input[i]);
		}
		
	return output;
	}
	
	String getReverseString(String input){
		String output="";
		for (int i=input.length() - 1;i >=0 ;i--){
			output = output + input.charAt(i);
		}
	return output;
	}
	
	
	public static void main(String[] arg){
		Assignment_18 assignment18 = new Assignment_18();
		String[] input = {"madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav"};
		//assignment18.getReverseArray(input);
		System.out.println(Arrays.toString(assignment18.getReverseArray(input)));
		System.out.println(Arrays.toString(assignment18.getReverseStringArray(input)));
		
	}
}
