package himanshu;

public class Assignment_19_Program2 {

	void maxWordLength(String input) {
		int max = 0;
		String maxWord = "";

		String[] arr = input.split(" ");

		for (int index = 0; index < arr.length; index++) {
			if (arr[index].length() > max) {
				max = arr[index].length();
				maxWord = arr[index];
			}
		}
		System.out.println("Maximum word length from given statement is : " + maxWord);
	}

	public static void main(String[] args) {

		String input = "good morning technocredits hi hello";

		Assignment_19_Program2 program2 = new Assignment_19_Program2();
		program2.maxWordLength(input);
	}

}
