package margi.Assignment_42;

/*Remove multiple occurrence of characters from given string.
input : "technocredits"
output : technordis*/

public class Assignment_42_1 {

	String getString(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			if (index == input.indexOf(input.charAt(index)))
				output += input.charAt(index);
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment_42_1 assignment_42_1 = new Assignment_42_1();
		System.out.println("Input: technocredits");
		System.out.println("Output: " + assignment_42_1.getString("technocredits"));
	}
}
