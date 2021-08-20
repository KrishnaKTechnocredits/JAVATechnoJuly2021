//Reverse all elements and place it in a reverse order

package shreya;

import java.util.Arrays;

public class Assignment18_2 {
	String getReverseString(String str) {
		String reverse = "";
		for(int index = str.length() - 1; index >=0; index--)
			reverse = reverse + str.charAt(index);
		return reverse;
	}
	
	String[] getArrayElements(String[] arr) {
		for(int index = 0; index < arr.length; index++) {
			arr[index] = getReverseString(arr[index]);
		}
		return arr;
	}
	
	String[] getReverseElementAtReverseOrder(String[] input) {
		String[] output = new String[input.length];
		for (int index = 0; index < input.length; index++) {
			output[(input.length - 1) - index] = getReverseString(input[index]);
		}
		return output;
	}
	public static void main(String[] args) {
		Assignment18_2 assignment18_2=new Assignment18_2();
		String[] input= {"techno", "credits", "krishna","harsh"};
		System.out.println(Arrays.toString(assignment18_2.getReverseElementAtReverseOrder(input)));

	}

}
