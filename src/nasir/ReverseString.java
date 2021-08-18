package nasir;

public class ReverseString {
	String getReverseString(String input) {
		String[] reverseString;
		String output = "";
		int count = 0;
		reverseString = input.split("");
		String words[] = new String[reverseString.length];
		for (int index = reverseString.length - 1; index >= 0; index--) {
			words[count] = reverseString[index];
			count++;
		}
		for (int index1 = 0; index1 <= words.length - 1; index1++) {
			output += words[index1] + " ";
		}

		return output;
	}

	public static void main(String[] args) {
		ReverseString reverseString = new ReverseString();
		System.out.println(reverseString.getReverseString("Technocredits"));
	}

}
