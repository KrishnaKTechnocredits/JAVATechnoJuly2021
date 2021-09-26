package himanshu_string_assignment;

public class String_Palindrome_2 {

	void checkStringIsPalindrome(String str) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == str.charAt(str.length() - index - 1))
				count++;
		}
		if (str.length() == count)
			System.out.println(str + " is a palindrome");
		else
			System.out.println( str + " is not a palindrome");
	}

	public static void main(String[] args) {
		
		String input = "madam";
		
		String_Palindrome_2 assignment29_2 = new String_Palindrome_2();
		assignment29_2.checkStringIsPalindrome(input);
	}

}
