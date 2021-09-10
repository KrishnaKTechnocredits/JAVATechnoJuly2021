package akshay;

public class Assignment30_3 {
	
	int getPallindrome(int num) {
		int rnum = 0;
		int sum = 0;
		while(num > 0) {
			rnum = num % 10;
			sum = sum * 10 + rnum;
			num = num /10;
		}
		return sum;
	}
	
	boolean displayPallindromeResult(int num) {
		boolean isPallindrome = false;
		if(getPallindrome(num) == num) {
			isPallindrome = true;
		}
		else {
			isPallindrome = false;
		}
		return isPallindrome;
	}
	
	public static void main(String[] args) {
		Assignment30_3 assignment30_3 = new Assignment30_3();
		int input = 12321;
		System.out.println(input+ " is a pallindrome number?: "+assignment30_3.displayPallindromeResult(input));
		int input1 = 1231;
		System.out.println(input+ " is a pallindrome number?: "+assignment30_3.displayPallindromeResult(input1));
	}
}
