package margi.Assignment_29;

public class Assignment_29_1 {
	
	//string is palindrome or not with reverse logic
	boolean isPalindrome(String input) {
		String revString = "";
		for(int index=input.length()-1; index>=0; index--) {
			revString = revString + input.charAt(index);
		}
		if(input.equals(revString))
			return true;
		else
			return false;
	}
	void displayResult(String input) {
		if(isPalindrome(input))
			System.out.println(input + " is palindrome");
		else
			System.out.println(input + " is not palindrome");
	}
	public static void main(String[] args) {
		Assignment_29_1 assignment_29_1 = new Assignment_29_1();
		String input = "malayalam";
		assignment_29_1.displayResult(input);
		Assignment_29_1 assignment_29_2 = new Assignment_29_1();
		input = "computer";
		assignment_29_2.displayResult(input);
	}
}
