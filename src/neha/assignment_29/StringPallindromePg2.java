package neha.assignment_29;

/*program 2: String Pallindrome by without writing reverse method logic.
String input = "naman";
String input = "aabbaa";
String input = "malayalam";*/
public class StringPallindromePg2 {
	void findAndDisplayStringPallindrome(String str) {
		int matchCount = 0;
		for (int index = 0; index < str.length() / 2; index++) {
			if (str.charAt(index) == str.charAt(str.length() - index - 1))
				matchCount++;
		}
		if (matchCount == str.length()/2)
			System.out.println("String " + str + " is pallindrome");
		else
			System.out.println("String " + str + " is not pallindrome");
	}

	public static void main(String[] args) {
		StringPallindromePg2 stringPallindromePg2 = new StringPallindromePg2();
		String input = "malayalam";
		stringPallindromePg2.findAndDisplayStringPallindrome(input);
		input = "aarchi";
		stringPallindromePg2.findAndDisplayStringPallindrome(input);
	}

}
