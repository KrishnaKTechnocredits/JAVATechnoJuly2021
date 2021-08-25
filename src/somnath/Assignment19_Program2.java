package somnath;
public class Assignment19_Program2 {

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
		Assignment19_Program2 assignment19_2 = new Assignment19_Program2();
		String input = "good morning technocredits hi hello";
		System.out.println("----------------------------------------------------");
		System.out.println("\n Maximum word length from given statement is \n : " + assignment19_2.maxLengthWord(input));
	    System.out.println("----------------------------------------------------");
	}
}