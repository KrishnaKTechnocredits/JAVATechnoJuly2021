/*Assignment - 37 : 23th Sep'2021
WAP to find a second largest word.

Example:
Input: Welcome to the family
Output: family*/

package shraddha.Assignment37;

public class SecondMaxWord {
	public static void main(String[] args) {
		String input = "Welcome to the family";
		String maxWord = "";
		String secondMax = "";
		String[] inputArr = input.split(" ");

		for (int index = 0; index < inputArr.length; index++) {
			if (inputArr[index].length() > maxWord.length())
				maxWord = inputArr[index];
			if (inputArr[index].length() < maxWord.length() && inputArr[index].length() > secondMax.length())
				secondMax = inputArr[index];
		}
		System.out.println("Second max word in the statement - " + input + " - will be :- " + secondMax);
	}
}
