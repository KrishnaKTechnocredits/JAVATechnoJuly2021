package akanksha_Jain.Assignment_30;

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