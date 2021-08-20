package suruchi;

public class Assignment18_Program1 {

	String getReverseString(String str) {
		String reverseString = "";
		for (int index = str.length() - 1; index >= 0; index--)
			reverseString += str.charAt(index);
		return reverseString;
	}

	String[] getReverseStringElementsInArray(String[] str) {
		for (int index = 0; index < str.length; index++)
			str[index] = getReverseString(str[index]);
		return str;

	}

	public static void main(String[] args) {
		Assignment18_Program1 assignment18_Program1 = new Assignment18_Program1();
		String[] input = { "madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav" };

		System.out.println("Array of words is as displayed: ");
		for (int index = 0; index < input.length; index++)
			System.out.print(input[index] + " ");
		System.out.println();

		String[] output = assignment18_Program1.getReverseStringElementsInArray(input);
		System.out.println();
		System.out.println("Reversed words in the array displayed as: ");
		for (int index = 0; index < input.length; index++)
			System.out.print(output[index] + " ");
	}
}