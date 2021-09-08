package shantanu.numberManipulation_assignment30;

public class ArmstrongNumberProgram {
	boolean isNumberArmstrong(int num) {
		int armstrong = 0;
		int originalNum = num;
		while(num > 0) {
			int remainder = num % 10;
			armstrong += remainder*remainder*remainder;
			num = num/10;
		}
		if(armstrong == originalNum)
			return true;
		else
			return false;
	}
	void displayResult(int num) {
		if(isNumberArmstrong(num))
			System.out.println(num + " is armstrong!");
		else
			System.out.println(num + " is not armstrong!");
	}
	public static void main(String[] args) {
		ArmstrongNumberProgram armstrongNumberProgram = new ArmstrongNumberProgram();
		armstrongNumberProgram.displayResult(371);
	}
}
