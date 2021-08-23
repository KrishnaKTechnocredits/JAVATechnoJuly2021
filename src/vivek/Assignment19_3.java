package vivek;

public class Assignment19_3 {

	String getMinWordLength(String input) {
		String[] arr = input.split(" ");
		String minWord = arr[0];
		for (int index = 0; index < arr.length; index++) {
			if (arr[index].length() < minWord.length())
				minWord = arr[index];
		}
		return minWord;
	}

	public static void main(String[] args) {
		Assignment19_3 assignment19_3 = new Assignment19_3();
		String input = "good morning technocredits hi hello";
		System.out.println(assignment19_3.getMinWordLength(input));
	}
}
