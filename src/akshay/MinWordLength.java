/*program 3 : Find minimum word length from given statement.
input = "good morning technocredits hi hello";
output : hi */

package akshay;

public class MinWordLength {
	String getMinWordLength(String input) {
		String[] arr = input.split(" ");
		String output = arr[0];
		for(int index = 0; index < arr.length; index++) {
			if (arr[index].length() < output.length()) {
				output = arr[index];
			}
		}
		return output;
	}
	
	
	public static void main(String[] args) {
		MinWordLength minwordlength = new MinWordLength();
		String input = "good morning technocredits hi hello";
		System.out.println(minwordlength.getMinWordLength(input));
	}

}
