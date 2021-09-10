package Rasika_assignment_30;

public class Program5 {

	void isPerfectSquare(int number) {
		int temp = 0;
		temp = (int) Math.sqrt(number);
		int temp1 = temp * temp;
		if(temp1 == number)
			System.out.println("The number is Perfect square number");
		else
			System.out.println("This number is not a perfect square number");
	}
	public static void main(String[] args) {
		Program5 program5 = new Program5();
		program5.isPerfectSquare(25);
		program5.isPerfectSquare(36);
		program5.isPerfectSquare(56);
	}
}
