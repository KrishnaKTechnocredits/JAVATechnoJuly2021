package somnath;
public class Assignment19_Program3 {
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
		Assignment19_Program3 assignment19_3 = new Assignment19_Program3();
		String input = "good morning technocredits hi hello";
		System.out.println("----------------------------------------------------");
		System.out.println("Minimum word length from given statement is : " + assignment19_3.minLengthWord(input));
		System.out.println("----------------------------------------------------");
	}
}