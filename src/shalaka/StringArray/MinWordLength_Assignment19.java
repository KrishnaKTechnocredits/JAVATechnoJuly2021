package shalaka.StringArray;

public class MinWordLength_Assignment19 {
	String getMinimumWordLength(String input) {
		String[] arr = input.split(" ");
		int minimumWordLength = arr[0].length();
		String minimumLengthWord = "";
		for (int index = 0; index < arr.length; index++) {
			if (arr[index].length() < minimumWordLength) {
				minimumWordLength = arr[index].length();
				minimumLengthWord = arr[index];
			}
		}
		return minimumLengthWord;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "good morning technocredits hi hello";
		MinWordLength_Assignment19 minWordLength_Assignment19 = new MinWordLength_Assignment19();

		System.out.println("Word with minimum length: " + minWordLength_Assignment19.getMinimumWordLength(input));
		//prog3_Assignment19.getMinimumWordLength(input);
	}

}
