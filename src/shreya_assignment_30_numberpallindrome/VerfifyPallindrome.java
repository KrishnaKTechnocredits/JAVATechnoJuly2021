package shreya_assignment_30_numberpallindrome;

public class VerfifyPallindrome {
	int reverse=0;
	void verifyPallindromeNumber(int num) {
		int number=num;
		while(num!=0) {
			int digit=num%10;
			reverse=reverse*10+digit;
			num/=10;
			
			}
		if (number == reverse) {
		      System.out.println(number + " is an Palindrome Number.");
		    }
		    else {
		      System.out.println(number + " is not an Palindrome Number.");
		}
	}
	public static void main(String[] args) {
		VerfifyPallindrome verfifyPallindrome=new VerfifyPallindrome();
		verfifyPallindrome.verifyPallindromeNumber(12321);
		verfifyPallindrome.verifyPallindromeNumber(123);

	}

}
