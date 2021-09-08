package nasir_Assignment_29;

public class StringPallindrome {
	String getReverseString(String inputString) {
		System.out.println("Given Input String is :- " + inputString);
		String reverseString = "";
		for (int index = inputString.length() - 1; index >= 0; index--) {
			reverseString += inputString.charAt(index);
		}
		return reverseString;
	}

	public static void main(String[] args) {
		StringPallindrome stringPallindrome=new StringPallindrome();
		String input="malayalam";
		String output=stringPallindrome.getReverseString(input);
		if(input.equals(output)) {
			System.out.println(input+ " is Palindrome");
		}else {
			System.out.println(input+ " is not Palindrome");
		}
	}
}
