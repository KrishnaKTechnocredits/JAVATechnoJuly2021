package neha;

/*program 1: Find how many words in a given statement.
input = "Hi Techno Credits Hello"
output : 4*/
public class Assignment19pg1 {
	int countWordsInString(String inputStr) {
		String[] splitString = inputStr.split(" ");
		return splitString.length;

	}

	public static void main(String[] args) {
		Assignment19pg1 assignment19pg1 = new Assignment19pg1();
		String input = "Hi Techno Credits Hello";
		System.out.println("Count of words in given statement is: " + assignment19pg1.countWordsInString(input));
	}
}
