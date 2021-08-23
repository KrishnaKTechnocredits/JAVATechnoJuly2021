package dattaraj;

public class Assignment_19_P3 {
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
		// TODO Auto-generated method stub
		Assignment_19_P3 assign19_p3 = new Assignment_19_P3();
		String input = "good morning technocredits hi hello";
		System.out.println("Max length word is: " + assign19_p3.minLengthWord(input));
	}

}
