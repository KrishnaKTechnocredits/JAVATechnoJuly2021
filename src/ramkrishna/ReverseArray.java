package ramkrishna;

import java.util.Arrays;

public class ReverseArray {

	String getReverseArray(String input) {

		String output = " ";

		for (int index = input.length() - 1; index >= 0; index--) {
			output = output + input.charAt(index);
		}

		return output;
	}

	String[] reverseArray(String[] input) {
		// String[] output = new String[input.length];

		for (int index = 0; index < input.length; index++) {
			// String rev = getReverseArray(input[index]);
			// output[index] = getReverseArray(input[index]);
			input[index] = getReverseArray(input[index]);
		}
		// return output;
		return input;

	}

	String[] reverseAllElement(String[] num) {

		String[] output = new String[num.length];

		int count = 0;
		for (int index = num.length - 1; index >= 0; index--) {
			output[count] = getReverseArray(num[index]);
			count++;
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReverseArray reversearray = new ReverseArray();

		// String ans =reversearray.getReverseArray("TechnoCredits");
		// System.out.println(ans);

		String[] input = { "madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav" };
		String[] output = reversearray.reverseArray(input);
		System.out.println(Arrays.toString(output));
		// for (int index = 0; index < input.length; index++) {
		// System.out.println(input[index]);

		String[] num = { "techno", "credits", "krishna", "harsh" };
		reversearray.reverseAllElement(num);
		System.out.println(Arrays.toString(reversearray.reverseAllElement(num)));
	}

}

//}
