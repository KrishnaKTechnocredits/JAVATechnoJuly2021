package suruchi;

public class Assignment18_Program2 {

	String getReverseString(String str) {
		String reverseString = "";
		for (int index = str.length() - 1; index >= 0; index--)
			reverseString += str.charAt(index);
		return reverseString;
	}

	String[] getReverseStringArray(String[] str) {
		String[] output = new String[str.length];
		for (int index = 0; index < str.length; index++)
			output[str.length - index - 1] = getReverseString(str[index]);
		return output;
	}

	public static void main(String[] args) {
		Assignment18_Program2 assignment18_Program2 = new Assignment18_Program2();
		String[] input = { "techno", "credits", "krishna", "harsh" };

		System.out.println("Array of words is as displayed: ");
		for (int index = 0; index < input.length; index++)
			System.out.print(input[index] + " ");

		System.out.println();
		System.out.println();
		String[] output = assignment18_Program2.getReverseStringArray(input);

		System.out.println("Array displayed in reverse with reversed elements in the array: ");

		for (int index = 0; index < output.length; index++)
			System.out.print(output[index] + " ");
	}
}