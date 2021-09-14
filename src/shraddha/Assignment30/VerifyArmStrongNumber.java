/*Assignment - 30 : 8th Sep'2021
Program 2:Verify whether given number is Armstrong number.
input:153 
output:153 is an Armstrong number

Q:	What is Armstrong number?
ans: An Armstrong number of three digits is an integer such that the sum of 
the cubes of its digits is equal to the number itself.
For example,371 is an Armstrong number since 3**3+7**3+1**3=371.
*/
package shraddha.Assignment30;

public class VerifyArmStrongNumber {
	public static void main(String[] args) {
		int number = 317;
		System.out.println("Input number is :- " + number);
		int sum = 0;
		int digit1 = number / 100;
		int digit2 = number % 100 / 10;
		int digit3 = number % 10;
		sum = (digit1 * digit1 * digit1) + (digit2 * digit2 * digit2) + (digit3 * digit3 * digit3);
		if (sum == number)
			System.out.println("Given number is Armstrong Number");
		else
			System.out.println("Given number is NOT an Armstrong Number");

	}
}
