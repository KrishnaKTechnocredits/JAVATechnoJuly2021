package Rasika_assignment_30;

public class Program3 {
	
	void isArmStrongNumber(int input){
		int num = input;
		int temp = 0;
		int sum = 0;
		while(num != 0) {
			temp = num % 10;
			sum = sum + (temp*temp*temp);
			num = num/10;
		}
		if(sum == input)
			System.out.println(input+" Number is a armstrong number");
		else
			System.out.println(input+" Number is not armstrong number");
	}
	
	public static void main(String[] args) {
		Program3 program3 = new Program3();
		program3.isArmStrongNumber(153);
		program3.isArmStrongNumber(1343);
	}
}
