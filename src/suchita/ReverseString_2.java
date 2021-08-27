package suchita;

import java.util.Arrays;

class ReverseString_2 {
	
	String getReverseString(String arr) {
		
		String reverse = "";
		for(int index=arr.length()-1;index>=0;index--) {
			reverse += arr.charAt(index);
		}
		return reverse;
	}
	
	String[] getReverseStringAtReversePosition(String[] arr) {
		
		String[] output = new String[arr.length];
		for(int index=0;index<arr.length;index++ ) {
			output[(arr.length-1)-index] = getReverseString(arr[index]);
		}
		return output;
	}
	
	public static void main(String[] args) {
		
		ReverseString_2 reverseStr = new ReverseString_2();
		String[] input = {"techno","credits","krishna","harsh"};
		String[] output = reverseStr.getReverseStringAtReversePosition(input);
		System.out.println("\n Printing the reverse of string at reverse position ::");
		System.out.println(Arrays.toString(output));
	}
}