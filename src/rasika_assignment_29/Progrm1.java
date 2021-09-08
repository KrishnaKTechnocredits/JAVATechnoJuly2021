package rasika_assignment_29;

public class Progrm1 {

	void isPalindrome(String str) {
		String reverse = "";
		for(int index = str.length() - 1; index >= 0; index--) {
			reverse = reverse + str.charAt(index);
		}
		if(str.equals(reverse)) {
			System.out.println(str+" string is palindrome string...");
		}
		else
			System.out.println(str+" is not a palindrome string..");
			}
	public static void main(String[] args) {
		Progrm1 program1 = new Progrm1();
		program1.isPalindrome("naman");
		program1.isPalindrome("ashvi");
	}
}
