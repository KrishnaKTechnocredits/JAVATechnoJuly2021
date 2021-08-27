/*program 2: Find maximum word length from given statement.
input = "good morning technocredits hi hello";
output : technocredits*/

package akshay;

public class MaxWordLength {
	
	String getMaxWordLength(String input) {
		String output = " ";
		String[] arr = input.split(" ");
		for(int index = 0; index < arr.length; index++) {
			if (arr[index].length() > output.length()) {
				output = arr[index];
			}
		}
		return output;
	}
	
	
	public static void main(String[] args) {
		MaxWordLength maxwordlength = new MaxWordLength();
		String input = "good morning technocredits hi hello";
		System.out.println(maxwordlength.getMaxWordLength(input));
	}
}
