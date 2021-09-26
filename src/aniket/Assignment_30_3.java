package aniket;

public class Assignment_30_3 {
	int getPalindromeNumber(int number) {
		int sum = 0;

		while (number != 0) {
			int lastnumber = number % 10;
			sum = sum * 10 + lastnumber;
			number = number / 10;
		}
		return sum;
	}
	
	boolean isPalindrome(int number) {
		boolean flag = true ;
		
		if(getPalindromeNumber(number)==number)
			flag=true;
		else
		flag=false;
		
		return flag;	
		
	}
	

	public static void main(String[] args) {
		System.out.println("The given number is palindrome : " + new Assignment_30_3().isPalindrome(12321));
	}
}
