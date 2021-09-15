package indrani;

public class Assignment_30_program5 {
	
	boolean isNumberPerfectSquare(int num) {

		int number;
		int temp;
		number = (int)Math.sqrt(num);
		temp = number * number;
		if(num == temp)
			return true;
		else
			return false;
	}
	
	void displayPerfectSquare(int number) {
	
		if(isNumberPerfectSquare(number))
			System.out.println(number + " is perfect square");
		else
			System.out.println(number + " is not perfect square");
	}
	
	public static void main(String[] args) {
		Assignment_30_program5 program5 = new Assignment_30_program5();
		program5.displayPerfectSquare(25);
		program5.displayPerfectSquare(20);
	}
}
