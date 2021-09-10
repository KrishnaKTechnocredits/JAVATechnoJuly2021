package chirag.assignment30;

public class NumberIsArmstrongOrNot {
	
	void isNumberArmstrong(int num) {
		int originalNumber = num;
		int remainder = 0;
		int sum = 0;
		while(originalNumber != 0) {
			
			remainder = originalNumber % 10;
			sum = sum + (remainder*remainder*remainder) ;
			originalNumber = originalNumber / 10;
		}
		
		if(sum == num) {
			System.out.println(num+ " : is an armstrong number");
		}
		else {
			System.out.println(num+ " : is not an armstrong number");
	}
	}
	public static void main(String[] args) {
		NumberIsArmstrongOrNot armstrongOrNot = new NumberIsArmstrongOrNot();
		int num=153;
		armstrongOrNot.isNumberArmstrong(num);	
	}
}
