/*
return middle char of all elements of the String array.
String[] str={"hello","techno","credits"}
*/

package sayali_V;

public class Assignment15_2 {

	char[] getMidCharOfStringArray(String[] input) {
		int midIndex = 0;
		char[] output = new char[input.length];
		for (int index = 0; index < input.length; index++) {
			if (input[index].length() % 2 == 0) {
				midIndex = input[index].length() / 2 - 1;
			} else {
				midIndex = input[index].length() / 2;
			}
			output[index] = input[index].charAt(midIndex);
		}
		return output;
	}

	public static void main(String[] args) {
		String[] input = { "hello", "techno", "credits" };
		char[] output = new char[input.length];
		Assignment15_2 assignment = new Assignment15_2();
		output = assignment.getMidCharOfStringArray(input);
		for (int index = 0; index < input.length; index++) {
			System.out.println("Middle character of String '" + input[index] + " ' is  " + output[index]);
		}
	}
}
