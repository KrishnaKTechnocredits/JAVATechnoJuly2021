package varun.varun_different_programs;

public class ArmstrongNumber {
	int givenNum=0;
	int result=0;
	void findArmstrongNumber(int num) {
		givenNum = num;
		while(num>0) {
			int rem = num%10;//3
			result = result + (rem*rem*rem);
			num = num/10;
		}
		if(givenNum == result)
			System.out.println("Number is Armstrong");
		else
			System.out.println("Number is not a Armstrong");
	}
	public static void main(String[] args) {
		ArmstrongNumber armstrongNumber = new ArmstrongNumber();
		armstrongNumber.findArmstrongNumber(153);
	}
}
