package vivek;

public class Assignment19_2 {

	String getMaxWordLength(String input) {
		String[] arr = input.split(" ");
		String maxWord = arr[0];
		for (int index = 0; index < arr.length; index++) {
			if (arr[index].length() > maxWord.length())
				maxWord = arr[index];
		}
		return maxWord;
	}

	public static void main(String[] args) {
		Assignment19_2 assignment19_2 = new Assignment19_2();
		String input = "good morning technocredits hi hello";
		System.out.println(assignment19_2.getMaxWordLength(input));
	}
}
