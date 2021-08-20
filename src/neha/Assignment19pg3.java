package neha;

/*program 3 : Find minimum word length from given statement.
input = "good morning technocredits hi hello";
output : hi*/
public class Assignment19pg3 {
	String minLengthWord(String strArray) {
		String[] splitString = strArray.split(" ");
		String minWord = splitString[0];
		for (int index = 0; index < splitString.length; index++) {
			if (minWord.length() > splitString[index].length())
				minWord = splitString[index];
		}
		return minWord;
	}

	public static void main(String[] args) {
		Assignment19pg3 assignment19pg3 = new Assignment19pg3();
		String input = "good morning technocredits hi hello";
		System.out.println("Minimum length word from given statement is: " + assignment19pg3.minLengthWord(input));
	}
}
