package ashit_assignment_29;

public class Project_2 {
	
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

			static void isPalindrome (boolean flag) {
			if (flag)
				System.out.println ("The given String is Palindrome");
			else 
				System.out.println ("The given String is not Palindrome");
		}

			public static void main(String[] args) {
				Project_2 project_2 = new Project_2();
				Project_2.isPalindrome(project_2.checkIfPalindromeWithoutReversing("malayalam"));
				Project_2.isPalindrome(project_2.checkIfPalindromeWithoutReversing("new"));
				Project_2.isPalindrome(project_2.checkIfPalindromeWithoutReversing("madam"));
			}

}


