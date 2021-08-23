package arti_G_Assignment18;

/*Assignment - 18 : 19th Aug'21
Program 2 : Reverse all elements and place it in a reverse order

String[] input = {"techno", "credits", "krishna","harsh"}
output : [hsrah, anhsirk, stiderc, onhcet]

Note : use sop(Arrays.toString(output)) to print the array content.*/
import java.util.Arrays;

public class ReverseOderString {

	String reverseString(String input) {
		String output = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			output = output + input.charAt(index);
		}
		return output;
	}

	// 2 program
	String[] reverseOderPlaceInReverseOder(String[] input) {
		String[] output = new String[input.length];
		int num = input.length-1;
		for (int index = 0; index < input.length; index++) {
			output[index] = reverseString(input[num]);
			num--;
		}
		return output;
	}

	public static void main(String[] args) {
		ReverseOderString reverseOderString = new ReverseOderString();
		String[] input = { "techno", "credits", "krishna", "harsh" };
		String[] output = reverseOderString.reverseOderPlaceInReverseOder(input);
		System.out.println("Reverse all elements and place it in a reverse order :");
		System.out.println(Arrays.toString(output));
	}
}