package suchita;


import java.util.Arrays;

class ReverseString {
	
	String getReverseString(String arr) {
		
		String reverse = "";
		for(int index=arr.length()-1;index>=0;index--) {
			reverse += arr.charAt(index);
		}
		return reverse;
	}
	
	String[] getReverseStringAtPosition(String[] arr) {
		
		String[] output = new String[arr.length];
		for(int index=0;index<arr.length;index++) {
			output[index] = getReverseString(arr[index]);
			
		}
		return output;
	}
	
	public static void main(String[] args) {
		
		ReverseString reverseStr = new ReverseString();
		String[] input = {"madhvi","surbhi","neha","sandesh","ankit","vaibhav"};
		String[] output = reverseStr.getReverseStringAtPosition(input);
		System.out.println("Printing the reverse of string at same position :: ");
		System.out.println(Arrays.toString(output));
	}
}