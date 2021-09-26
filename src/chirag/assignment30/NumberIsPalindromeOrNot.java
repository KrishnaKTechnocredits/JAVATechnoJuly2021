package chirag.assignment30;
	
	public class NumberIsPalindromeOrNot {
		
		void numberIsPalindrome(int number) {
			int remainder = 0;
			int sum = 0;
			int num = number;
			while(num > 0) {
				remainder = num % 10;
				sum = sum * 10 + remainder;
				num = num / 10;
			}
				if(number == sum) {
					System.out.println(number+ ": is pallindrome");
				}
					else {
					System.out.println(number+" : is not pallindrome");
					}
		}
		public static void main(String[] args) {
			NumberIsPalindromeOrNot isPallindromeOrNot = new NumberIsPalindromeOrNot();
			int number = 12321;
			isPallindromeOrNot.numberIsPalindrome(number);
			number = 123;
			isPallindromeOrNot.numberIsPalindrome(number);
			}
	}
