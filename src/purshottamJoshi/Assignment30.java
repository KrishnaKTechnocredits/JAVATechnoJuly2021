package purshottamJoshi;

class Assignment30{
	
	int reverseNumber(int num) {
		
		int sum = 0;
		
		while (num > 0) {
			int a;
			a = num % 10;
			sum = sum * 10 + a;
			num = num / 10;
		}
		return sum;
	}
	
	boolean checkNumPalindrome(int num) {
		int num1 = num;
		int sum = 0;
		
		while (num > 0) {
			int a;
			a = num % 10;
			sum = sum * 10 + a;
			num = num / 10;
		}
		if (sum == num1)
		
			return true;
			return false;
	}
	
	
	public static void main(String[] args){
		
		int number =1932;
		int number2=22522;
		Assignment30 assignment30 = new Assignment30();
		
		System.out.println("Reverse number is : "+assignment30.reverseNumber(number));
		
		boolean isNumPalindrome = assignment30.checkNumPalindrome(number2);
		if (isNumPalindrome)
			System.out.println(number2+" is palindrome");
		else
			System.out.println(number2+" is not a palindrome");
	}
}