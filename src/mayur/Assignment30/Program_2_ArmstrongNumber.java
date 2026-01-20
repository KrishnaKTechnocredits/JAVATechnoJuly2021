package mayur.Assignment30;
/* Assignment - 30 : 8th Sep'2021
Program 2: Verify whether given number is Armstrong number.
input : 153
output : 153 is an Armstrong number
 
Q: what is Armstrong number ?
ans : An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself. For example, 371 is an Armstrong number since 3**3 + 7**3 + 1**3 = 371.
*/

public class Program_2_ArmstrongNumber {

	int isArmstrongNumber(int number) {
		int remainder, temp=0, temp2=0;
		while(number > 0) {
			remainder = number % 10;
			temp = remainder * remainder * remainder;
			temp2 = temp2 + temp;
			number = number / 10;
		}
		return temp2;
	}
	
	void displayArmstrongResult(int number) {
		if(isArmstrongNumber(number)==number)
			System.out.println(number + " is an armstrong number.");
		else
			System.out.println(number + " is not an armstrong number.");
	}
	
	public static void main(String[] args) {
		int number = 371;
		Program_2_ArmstrongNumber armstNumber = new Program_2_ArmstrongNumber();
		armstNumber.displayArmstrongResult(number);
	}
}