package akanksha_Jain.Assignment_30;

public class Program_1_ReverseNumber {
	static int rNumber = 0; 
			
	void reverseTheNumber(int number) {
		int remainder;
		while(number > 0) {
			remainder = number % 10;
			rNumber = rNumber * 10 + remainder;
			number = number / 10;
		}
	}
	
	public static void main(String[] args) {
		int number = 1932;
		Program_1_ReverseNumber reverseNumber = new Program_1_ReverseNumber();
		reverseNumber.reverseTheNumber(number);
		System.out.println("The reverse number of " + number + " is- " + rNumber);
	}
}