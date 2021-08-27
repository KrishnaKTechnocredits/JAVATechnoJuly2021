package shantanu.assignment19;

public class NumberOfWordsInString {
	
	int splitString(String str) {
		String[] arr = str.split(" ");
		return arr.length;
	}
	
	void displayTotalNumberOfWords(String str) {
		System.out.println("Total words in "+ "\"" + str + "\"" + " are: "+ splitString(str));
	}
	public static void main(String[] args) {
		NumberOfWordsInString numberOfWordsInString = new NumberOfWordsInString();
		String input = "Hi Techno Credits Hello";
		numberOfWordsInString.displayTotalNumberOfWords(input);
	}
}