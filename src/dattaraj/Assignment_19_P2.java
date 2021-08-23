package dattaraj;

public class Assignment_19_P2 {
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
		// TODO Auto-generated method stub
		Assignment_19_P2 assign19_p2 = new Assignment_19_P2();
		String input = "good morning technocredits hi hello";
		System.out.println("Max length word is: " + assign19_p2.maxLengthWord(input));

	}

}
