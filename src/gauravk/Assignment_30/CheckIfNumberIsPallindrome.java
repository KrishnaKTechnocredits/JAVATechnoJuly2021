package gauravk.Assignment_30;
/*
 *   Assignment - 30 : 8th Sep'2021
Program 1: Write a method to reverse a given number.
input : 1932
output : 2391

Program 2: Verify whether given number is Armstrong number.
input : 153
output : 153 is an Armstrong number

Q: what is Armstrong number ?
ans : An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself. For example, 371 is an Armstrong number since 3**3 + 7**3 + 1**3 = 371.

Program 3: Verify given number is an Palindrome number.
input : 12321
output : 12321 is an Palindrome number

input : 123
output : 123 is not an Palindrome number.

(Optional) Program 4 : verify given number is a perfect number or not.

(Optional) Program 5 : verify given number is a perfect square.
 */
public class CheckIfNumberIsPallindrome {
	
	String isPallindrome(int num) {
		ReverseDigitsOfGivenNumber checkingPallindrome = new ReverseDigitsOfGivenNumber();
		int result = checkingPallindrome.reversingDigitSequence(num);
		if(num==result)
			return "Pallindrome";
		else return "NOT Pallindrome";
	}
	
	public static void main(String[] args) {
		int input = 12321;
		int input1 = 13467;
		CheckIfNumberIsPallindrome abc = new CheckIfNumberIsPallindrome();
		System.out.println("The number "+input+" is "+abc.isPallindrome(input));
		System.out.println("The number "+input1+" is "+abc.isPallindrome(input1));
	}
}
