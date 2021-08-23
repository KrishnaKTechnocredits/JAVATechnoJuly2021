package neha;

/*Write a method which takes one String parameter and return a reverse String.
input : technocredits
output : stiderconhcet*/
public class Assignment17ReverseString {
	String getReverseString(String input) {
		String output = "";
		int outIndex = input.length() - 1;
		for (; outIndex >= 0; outIndex--) {
			output += input.charAt(outIndex);
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment17ReverseString assignment17ReverseString = new Assignment17ReverseString();
		String input = "technocredits";
		// String input = "DearSara";
		System.out.println("Reversed string is: " + assignment17ReverseString.getReverseString(input));

	}
}
