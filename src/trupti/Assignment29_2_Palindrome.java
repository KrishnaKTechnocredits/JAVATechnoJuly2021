package trupti;

public class Assignment29_2_Palindrome {

	boolean isPalindrome(String input1) {
		String input=input1.toLowerCase();
		int i = 0, j = input.length() - 1;
		while (i < j) {
			if (input.charAt(i) != input.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		Assignment29_2_Palindrome p = new Assignment29_2_Palindrome();
		String input = "MalaYaLAM";
		if (p.isPalindrome(input)) {
			System.out.println(input + " is Palindrome");
		} else {
			System.out.println(input + " is not Palindrome");
		}
	}
}
