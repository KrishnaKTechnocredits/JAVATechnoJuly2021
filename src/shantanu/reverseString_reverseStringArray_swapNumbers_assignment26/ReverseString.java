package shantanu.reverseString_reverseStringArray_swapNumbers_assignment26;

public class ReverseString {
	String getReversedString(String input) {
		String str = "";
		for(int index = input.length() - 1; index >= 0; index--)
			str += input.charAt(index);
		return str;
	}
	void displayReversedString(String input) {
		System.out.println("String in reverse:");
		System.out.println(getReversedString(input));
	}
	public static void main(String[] args) {
		ReverseString reverseString = new ReverseString();
		String input = "This is technocredits";
		reverseString.displayReversedString(input);
	}
}
