package shalaka.Assignment29;

public class NumberPalindrome {
	int rev = 0;
	//boolean isPalindrome=true;
	boolean  isNumberPalindrome(int num) {
		int temp=num;
		while (num > 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		if (temp == rev)
			return true;
		else
			return false;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12321;
		NumberPalindrome numberPalindrome = new NumberPalindrome();
		boolean isPelindrome=numberPalindrome.isNumberPalindrome(num);
		if(isPelindrome)
			System.out.println(num+" is Palindrome");
		else
			System.out.println(num+" is not Palindrome");

	}

}
