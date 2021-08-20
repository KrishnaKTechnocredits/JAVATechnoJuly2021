package trupti;

public class Assignment_17 {

	String getReverseString(String input) {
		String output = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			output = output + input.charAt(index);
		}
		return output;
	}

	public static void main(String[] arg) {
		Assignment_17 reverse = new Assignment_17();
		String str = "newdelhi";
		String reverseString = reverse.getReverseString(str);
		System.out.println(reverseString);

	}

}
