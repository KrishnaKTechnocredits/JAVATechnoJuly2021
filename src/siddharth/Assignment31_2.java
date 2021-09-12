package siddharth;

public class Assignment31_2 {
	void checkPerfectSquare(int num) {
		int sqrt = (int) Math.sqrt(num);
		if (num == (sqrt * sqrt))
			System.out.println(num + " is a perfect square");
		else
			System.out.println(num + " is not a perfect square");
	}

	public static void main(String[] args) {
		Assignment31_2 assignment31_2 = new Assignment31_2();
		int num1 = 25;
		int num2 = 20;
		assignment31_2.checkPerfectSquare(num1);
		assignment31_2.checkPerfectSquare(num2);
	}
}
