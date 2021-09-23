/*	Program 2: Verify whether given number is Armstrong number.
input : 153
output : 153 is an Armstrong number
 */
package ashit_assignment_30;

public class ArmStrongNumber {

	void isarmStrongNum(int numInput){

		int number = numInput;
		int num1 = 0;
		int result = 0;

		while(number > 0){
			int remainder = number %10;
			num1 = remainder * remainder * remainder;
			result = result + num1;
			number = number/10;
		}

		if(result == numInput)
			System.out.println("Given number "+numInput+" is an Armstrong Number");
		else
			System.out.println("Given number "+numInput+" is Not an Armstrong Number");
	}

	public static void main(String[] args){
		int no = 153;
		new ArmStrongNumber().isarmStrongNum(no);
	}
}
