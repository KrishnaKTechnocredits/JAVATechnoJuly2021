package chandni_bhoj_Assignment_29;

public class Program_2 {
	
	boolean checkIfPalindromeWithoutReversing (String input) {
		boolean flag = false;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == input.charAt(input.length()-1 - index))
				flag = true;
			else
				flag = false;
				break;
		}
		return flag;
	}
	
		void isPalindrome (boolean flag) {
		if (flag)
			System.out.println ("The given String is Palindrome");
		else 
			System.out.println ("The given String is not Palindrome");
	}

		public static void main(String[] args) {
			Program_2 program_2 = new Program_2();
			program_2.isPalindrome(program_2.checkIfPalindromeWithoutReversing("malayalam"));
			program_2.isPalindrome(program_2.checkIfPalindromeWithoutReversing("new"));
			program_2.isPalindrome(program_2.checkIfPalindromeWithoutReversing("madam"));
		}

}
