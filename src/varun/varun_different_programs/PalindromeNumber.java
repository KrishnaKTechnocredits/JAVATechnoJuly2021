package varun.varun_different_programs;

public class PalindromeNumber {
	int ans=0;
	int numToCheck=0;
	void numIsPalindrome(int num) {
		numToCheck = num;
		while(num>0) {
			int remainder = num%10;
			ans = ans*10 +remainder;
			num = num/10;
		}
		if(ans == numToCheck)
			System.out.println("Number is palindrome");
		else
			System.out.println("Given number is not palindrome");
	}
	
	public static void main(String[] args) {
		PalindromeNumber palindromeNumber = new PalindromeNumber();
		palindromeNumber.numIsPalindrome(545);
	}
}
