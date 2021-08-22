package shalaka.StringArray;

public class MaximumWordLength_Assignment19 {

	String getMaximumWordLength(String input) {
		int maxWordlength = 0;
		String maxLengthWord = "";
		String[] arr = input.split(" ");
		for (int index = 0; index < arr.length; index++) {
			if (arr[index].length() > maxWordlength) {
				maxWordlength = arr[index].length();
				maxLengthWord = arr[index];
			}
		}
		return maxLengthWord;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "good morning technocredits hi hello";
		MaximumWordLength_Assignment19 maximumWordLength_Assignment19 = new MaximumWordLength_Assignment19();
		System.out.println("Word with maximum length: " + maximumWordLength_Assignment19.getMaximumWordLength(input));
	}

}
