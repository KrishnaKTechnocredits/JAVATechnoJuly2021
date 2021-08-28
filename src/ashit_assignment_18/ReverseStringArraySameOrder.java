package ashit_assignment_18;

import java.util.Arrays;

public class ReverseStringArraySameOrder {

	String reversingString(String str) {
		String str1 = "";
		for(int i=str.length()-1; i>=0; i--) {
			str1 += str.charAt(i);
		}
		return str1;
	}

	String[] reversingStringArrayElements(String[] arr1) {
		String[] arr2 = new String[arr1.length];
		for(int i=0; i<arr1.length; i++) {
			arr2[i] = reversingString(arr1[i]);
		}
		return arr2;
	}

	public static void main(String[] a) {
		String[] input = {"madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav"};
		String[] output = new ReverseStringArraySameOrder().reversingStringArrayElements(input);
		System.out.println("Reverse of all elements in the array"+Arrays.toString(input)+" in the same order is: \n"+Arrays.toString(output));
	}
}