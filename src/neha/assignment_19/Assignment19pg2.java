package neha.assignment_19;

/*program 2: Find maximum word length from given statement.
input = "good morning technocredits hi hello";
output : technocredits*/
public class Assignment19pg2 {

	String maxLengthWord(String strArray) {
		String[] splitString = strArray.split(" ");
		String maxWord = "";
		for (int index = 0; index < splitString.length; index++) {
			if (splitString[index].length() > maxWord.length())
				maxWord = splitString[index];
		}
		return maxWord;
	}

	public static void main(String[] args) {
		Assignment19pg2 assignment19pg2 = new Assignment19pg2();
		String input = "good morning technocredits hi hello";
		System.out.println("Maximum length word from given statement is: " + assignment19pg2.maxLengthWord(input));
	}
}
