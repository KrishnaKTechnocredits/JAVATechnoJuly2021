package shweta_Dharmadhikari.array_examples;

public class MiddleCharacterOfAllElements {

	char[] getMiddlecharacter(String arr[]) {
		char[] ch = new char[3];
		for (int index = 0; index < arr.length; index++) {
			String str = arr[index];
			if (str.length() % 2 == 0)
				ch[index] = str.charAt(str.length() / 2 - 1);
			else
				ch[index] = str.charAt(str.length() / 2);
		}
		return ch;

	}

	public static void main(String[] args) {
		String[] str = { "hello", "techno", "credits" };
		MiddleCharacterOfAllElements middleCharacterOfAllElements = new MiddleCharacterOfAllElements();
		char[] middleChar = middleCharacterOfAllElements.getMiddlecharacter(str);
		for (int index = 0; index < str.length; index++) {
			System.out.println("Middle character of " + str[index] + " is " + middleChar[index]);
		}
	}
}