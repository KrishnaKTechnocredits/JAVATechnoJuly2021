package mratunjay.Assignment_19;

public class Assignment_19 {

	String str = "Hi Techno Credits Hello";
	String[] str1 = new String[10];
	String input = "10 10 20 30";

	void findHowManyWordsInGivenString(String str) {

		str1 = str.split(" ");
		System.out.println("Number of words in given string: "+str1.length);
	}

	void findMaximumWordLengthFromGivenStatement(String[] str) {
		String output = "";
		for (int index = 0; index < str.length; index++) {

			if (str[index].length() > output.length()) {

				output = str[index];

			}

		}
		System.out.println("Maximum length word in given string: "+ output);
	}

	void findMinimumWordLengthFromGivenStatement(String[] str) {
		String output = str[0];
		for (int index = 0; index < str.length; index++) {

			if (str[index].length() < output.length()) {

				output = str[index];

			}

		}
		System.out.println("Minimum length word in given string: "+ output);
	}

	void sumOfAllNumbers(String str) {
		String[] s1 = str.split(" ");
		int sum = 0;
		for (int index = 0; index < s1.length; index++) {

			sum += Integer.parseInt(s1[index]);

		}
		System.out.println("Sum of all numbers in input string: " +sum);
	}

	public static void main(String[] args) {

		Assignment_19 A_19 = new Assignment_19();
		A_19.findHowManyWordsInGivenString(A_19.str);
		A_19.findMaximumWordLengthFromGivenStatement(A_19.str1);
		A_19.findMinimumWordLengthFromGivenStatement(A_19.str1);
		A_19.sumOfAllNumbers(A_19.input);

	}

}