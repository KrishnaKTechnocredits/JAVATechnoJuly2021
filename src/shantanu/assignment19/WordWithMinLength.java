package shantanu.assignment19;

public class WordWithMinLength {
	
	String splitString(String str) {
		String minString = " ";
		String[] arr = str.split(" ");
		int minLength = arr[0].length();
		for(int index = 0; index < arr.length; index++) {
			if(minLength > arr[index].length()) {
				minLength = arr[index].length();
				minString = arr[index];
			}
		}
		return minString;
	}
	void displayWordWithMinLength(String str) {
		System.out.println("Word with min length is: "+ splitString(str));
	}
	public static void main(String[] args) {
		WordWithMinLength wordWithMinLength = new WordWithMinLength();
		String input = "good morning technocredits hi hello";
		wordWithMinLength.displayWordWithMinLength(input);
	}
}
