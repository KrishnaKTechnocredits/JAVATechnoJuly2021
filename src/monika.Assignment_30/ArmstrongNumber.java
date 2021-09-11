/*Program 2: Verify whether given number is Armstrong number.
input : 153
output : 153 is an Armstrong number*/
package monika.Assignment_30;

public class ArmstrongNumber {

	void armstrongNumber(int number1) {
		int number2, temp, result=0;
		number2=number1;
		while(number2!=0) {
			temp=number2%10;
			result+=temp*temp*temp;
			number2/=10;
		}
		if(result==number1)
			System.out.println(number1+" is an Armstrong Number");
		else
			System.out.println(number1+" is not an Armstrong Number");
		
	}
	public static void main(String[] args) {
		ArmstrongNumber armNumber=new ArmstrongNumber();
		armNumber.armstrongNumber(153);
	}
}
