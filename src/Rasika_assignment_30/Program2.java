package Rasika_assignment_30;
/*input : 12321
output : 12321 is an Palindrome number*/
public class Program2 {
	void isPalindrome(int number){
		int reverse = 0;
		int remainder =0;
		int number1 = number;
		while(number > 0) {
			remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number /10;
		}
		if(number1 == reverse)
			System.out.println(number1+" is palindrome number..");
		else
			System.out.println(number1+" is not palindrome number..");
	}
	public static void main(String[] args) {
		Program2 program2 = new Program2();
		program2.isPalindrome(12321);
		program2.isPalindrome(123);
	}
}
