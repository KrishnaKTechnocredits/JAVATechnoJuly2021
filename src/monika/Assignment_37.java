/*Assignment - 37 : 23th Sep'2021
WAP to find a second largest word.

Example:
Input: Welcome to the family
Output: family*/

package monika;

public class Assignment_37 {
	String getSecondHighestEleFromString(String input) {
		String[] output = input.split(" ");
		String maxWord = "", secondMax = "";
		for (int index = 0; index < output.length; index++) {
			if (output[index].length() > maxWord.length()) {
				secondMax = maxWord;
				maxWord = output[index];
			} else if (output[index].length() > secondMax.length())
				secondMax = output[index];
		}
		return secondMax;
	}

	public static void main(String[] args) {
		String input = "Welcome to the family";
		Assignment_37 assignmnet_37=new Assignment_37();
		System.out.println("Second Highest element from the given String is: " + assignmnet_37.getSecondHighestEleFromString(input));
	
	}
}
