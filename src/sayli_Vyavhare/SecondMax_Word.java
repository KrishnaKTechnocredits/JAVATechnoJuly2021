/*Assignment - 37 : 23th Sep'2021
WAP to find a second largest word.

Example:
Input: Welcome to the family
Output: family*/
package sayli_Vyavhare;

public class SecondMax_Word {

	void getSecondMax(String input) {
		int max = 0, temp = 0, index, second = 0;
		String word = "";
		String[] str = input.split(" ");
		for (index = 0; index < str.length; index++) {
			temp = str[index].length();

			if (temp > max) {
				max = temp;
			} else if (second < temp) {
				second = temp;
				word = str[index];
			}
		}
		System.out.println("Second maximum word is:" + word + " with length : " + second);
	}

	public static void main(String[] args) {

		SecondMax_Word second = new SecondMax_Word();
		second.getSecondMax("Welcome to the family");
	}
}
