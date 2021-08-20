package shantanu.assignment18;

import java.util.Arrays;

public class ReverseElementsInReverseOrder {
	String getReverseString(String str) {
		String reverse = "";
		for(int index = str.length() - 1; index >= 0; index--)
			reverse = reverse + str.charAt(index);
		return reverse;
	}
	
	String[] getArrayElementsInReverseOrder(String[] arr) {
		
		String temp = "";
		int start = 0, end = arr.length - 1;
		for(int index = 0; index <= arr.length - 1; index++)
			arr[index] = getReverseString(arr[index]);
		
		while(start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	          
	    return arr;
	}
	
	void displayArrayElementsInReverseOrder(String[] arr) {
		getArrayElementsInReverseOrder(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		ReverseElementsInReverseOrder reverseElementsInReverseOrder = new ReverseElementsInReverseOrder();
		String[] input = {"techno", "credits", "krishna","harsh"};
		reverseElementsInReverseOrder.displayArrayElementsInReverseOrder(input);
	}
}
