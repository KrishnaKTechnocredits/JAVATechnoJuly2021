package margi.Assignment_30;

public class Assignment_30_2 {
	
	//number is armstrong or not
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
	
	void displayResult(int number) {
		if(isArmstrong(number))
			System.out.println(number + " is an armstrong number");
		else
			System.out.println(number + " is not an armstrong number");
	}
	
	public static void main(String[] args) {
		Assignment_30_2 assignment_30_2 = new Assignment_30_2();
		int num = 153;
		assignment_30_2.displayResult(num);
	}
}
