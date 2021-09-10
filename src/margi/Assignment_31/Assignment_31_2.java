package margi.Assignment_31;

public class Assignment_31_2 {

	//number is a perfect square or not
	boolean isPerfectSquare(int num) {
		int number;
		int temp;
		number = (int)Math.sqrt(num);
		temp = number * number;
		if(num == temp)
			return true;
		else
			return false;
	}
	
	void displayResult(int number) {
		if(isPerfectSquare(number))
			System.out.println(number + " is perfect square");
		else
			System.out.println(number + " is not perfect square");
	}
	
	public static void main(String[] args) {
		Assignment_31_2 assignment_31_2_1 = new Assignment_31_2();
		int num = 25;
		assignment_31_2_1.displayResult(num);
		Assignment_31_2 assignment_31_2_2 = new Assignment_31_2();
		num = 20;
		assignment_31_2_2.displayResult(num);
		
	}
}
