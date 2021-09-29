package margi.Assignment_42;

/*Remove all occurrence of duplicate character from given string.
input : "technocredits"
output : "hnordis"*/

public class Assignment_42_2 {

	String getString(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			if (input.indexOf(input.charAt(index)) == input.lastIndexOf(input.charAt(index)))
				output += input.charAt(index);
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment_42_2 assignment_42_2 = new Assignment_42_2();
		System.out.println("Input: technocredits");
		System.out.println("Output: " + assignment_42_2.getString("technocredits"));
	}
}
