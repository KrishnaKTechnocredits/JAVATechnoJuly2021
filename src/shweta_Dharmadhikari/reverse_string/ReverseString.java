package shweta_Dharmadhikari.reverse_string;

public class ReverseString {

	String getreverseString(String input) {
		String output = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			output += input.charAt(index);
		}
		return output;
	}

	public static void main(String[] args) {
		String input = "technocredits";
		ReverseString reverseString = new ReverseString();
		System.out.println("Reverse string of " + input + " is: " + reverseString.getreverseString(input));
	}

}
