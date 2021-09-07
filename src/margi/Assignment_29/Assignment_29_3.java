package margi.Assignment_29;

public class Assignment_29_3 {
	
	//number is palindrome or not without make it string
	boolean isPalindrome(int input) {
		int number = input;
		int temp=0, remainder;
		while(number > 0) {
			remainder = number%10;
			temp = (temp*10) + remainder;
			number = number/10;
		}
		if(input == temp)
			return true;
		else
			return false;
	}
	void displayResult(int number) {
		if(isPalindrome(number))
			System.out.println(number + " is palindrome");
		else
			System.out.println(number + " is not palindrome");
	}
	public static void main(String[] args) {
		Assignment_29_3 assignment_29_1 = new Assignment_29_3();
		int num = 12321;
		assignment_29_1.displayResult(num);
		Assignment_29_3 assignment_29_2 = new Assignment_29_3();
		num = 1234;
		assignment_29_2.displayResult(num);
	}
}
