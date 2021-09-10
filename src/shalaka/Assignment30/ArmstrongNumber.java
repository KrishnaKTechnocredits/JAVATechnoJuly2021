/*Program 2: Verify whether given number is Armstrong number.
input : 153
output : 153 is an Armstrong number
:Q. what is Armstrong number ?
ans : An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself. For example, 371 is an Armstrong number since 3*3 + 73 + 1*3 = 371.
*/

package shalaka.Assignment30;

public class ArmstrongNumber {
	boolean isArmstrongNumber(int number) {
		int rem = 0;
		int sum = 0;
		int orignalNumber = number;
		while (number > 0) {
			rem = number % 10;
			sum += (rem * rem * rem);
			number=number/10;
		}
		
		if (orignalNumber == sum)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 153;
		ArmstrongNumber armstrongNumber = new ArmstrongNumber();
		boolean isArmstrong = armstrongNumber.isArmstrongNumber(number);
		if (isArmstrong)
			System.out.println(number + " is Armstrong number");
		else
			System.out.println(number + " is not Armstrong number");
	}
}
