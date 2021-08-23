package parthav.parthavD_Assignment20;

public class FindUniqueCharactersInString {

	void printUniqueCharactersInString(String inputStr) {
		System.out.println("Unique characters in the string " + inputStr + " are: ");
		for (int index = 0; index < inputStr.length(); index++) {
			char ch = inputStr.charAt(index);
			if (inputStr.indexOf(ch) == inputStr.lastIndexOf(ch))
				System.out.println(ch);

		}
	}

}
