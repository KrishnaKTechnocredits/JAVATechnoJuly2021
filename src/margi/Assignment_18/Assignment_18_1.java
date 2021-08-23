package margi.Assignment_18;

import java.util.Arrays;

public class Assignment_18_1 {
	
	//Reverse all elements of an array at same position
	String[] processData(String[] input) {
		for(int index=0; index < input.length; index++) {
			input[index] = reverseStr(input[index]);
		}
		return input;
	}
	
	String reverseStr(String name) {
		String str = "";
		for(int index=name.length()-1; index >= 0 ; index--) {
			str = str + name.charAt(index);
		}
		return str;
	}
	
	void setData() {
		String[] input = {"madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav"};		
		System.out.println(Arrays.toString(processData(input)));
	}
	
	public static void main(String[] args) {
		Assignment_18_1 arr = new Assignment_18_1();
		arr.setData();
	}
}
