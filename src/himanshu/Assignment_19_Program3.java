package himanshu;

public class Assignment_19_Program3 {

	void minWordLength(String input) {

		String minWord = "";

		String[] arr = input.split(" ");

		int min = arr[0].length();

		for (int index = 0; index < arr.length; index++) {
			if (arr[index].length() < min) {
				min = arr[index].length();
				minWord = arr[index];
			}
		}
		System.out.println("Minimum word length from given statement is: " + minWord);

	}

	public static void main(String[] args) {

		String input = "good morning technocredits hi hello";

		Assignment_19_Program3 program3 = new Assignment_19_Program3();
		program3.minWordLength(input);

	}

}
