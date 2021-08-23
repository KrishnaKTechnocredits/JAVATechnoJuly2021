package shantanu.assignment19;

public class WordWithMaxLength {
	
	String splitString(String str) {
		int maxLength = 0;
		String maxString = " ";
		
		String[] arr = str.split(" ");
		for(int index = 0; index < arr.length; index++) {
			if(maxLength < arr[index].length()) {
				maxLength = arr[index].length();
				maxString = arr[index];
			}
		}
			
		return maxString;			
	}
	void displayWordWithMaxLength(String str) {
		System.out.println("Word with maximum length is: "+splitString(str));
	}
	public static void main(String[] args) {
		WordWithMaxLength wordWithMaxLength = new WordWithMaxLength();
		String input = "good morning technocredits hi hello";
		wordWithMaxLength.displayWordWithMaxLength(input);
	}
}
