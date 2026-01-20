package mayur.Assignment30;
/* Assignment - 30 : 8th Sep'2021
Program 1: Write a method to reverse a given number.
input : 1932
output : 2391
*/

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