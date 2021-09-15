package indrani;

public class Assignment_30_program2 {
	
	boolean isArmstrong(int num) {
		int digit, number = num;
		int sum=0;
		while(num > 0) {
			digit = num%10;
			sum += digit * digit * digit;
			num = num/10;
		}
		if(number == sum)
			return true;
		else
			return false;
	}
	
	void displayArmstrong(int number) {
		if(isArmstrong(number))
			System.out.println(number + " is an armstrong number");
		else
			System.out.println(number + " is not an armstrong number");
	}
	
	public static void main(String[] args) {
		Assignment_30_program2 program2 = new Assignment_30_program2();
		int num = 153;
		program2.displayArmstrong(num);
	}
}
