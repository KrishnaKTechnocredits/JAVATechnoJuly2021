package purshottamJoshi;
//Assignment29
public class Palindrome {
	
	String output ="";
	void checkPalindrome(String input) {
		input=input.toLowerCase();
		for(int innerindex= input.length()-1; innerindex >=0; innerindex--) {
						output += input.charAt(innerindex);
					
		}
		
		if(output.equals(input)) {
			System.out.println(input+" is a palindrome string");
		}else  {
			System.out.println(input+" is not a palindrome string");
		}
	}
	
	boolean isPalindrome(String input) {
		input = input.toLowerCase();
		int midIndex = input.length() / 2;
		int length = input.length();
		boolean isPalindrome = true;

		if (midIndex / 2 == 0) {
			for (int index = 0; index <= midIndex - 1; index++) {
				if (input.charAt(index) != input.charAt(length-1))	{
					isPalindrome = false;
					break;
				} else
					length--;
			}
		} else {

			for (int index = 0; index < midIndex; index++) {
				if (input.charAt(index) != input.charAt(length-1)) {	
					isPalindrome = false;
					break;
				} else
					length--;
			}
		}
		return isPalindrome;
	}

	void displayPalindrome(String input) {
		if (isPalindrome(input))
			System.out.println(input+" is a Palindrome string");
		else
			System.out.println(input+" is not a Palindrome string");
	}
	
	public static void main(String[] args) {
		String str = "NAmaN";
		String input= "malayalam";
		String input2="UBSsbu";
		String input3="purushottam";
		Palindrome palindrome = new Palindrome();
		palindrome.checkPalindrome(str);
		palindrome.displayPalindrome(input2);
		palindrome.displayPalindrome(input3);
	}
}
