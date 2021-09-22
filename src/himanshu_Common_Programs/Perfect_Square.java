package himanshu_Common_Programs;

public class Perfect_Square {

	void checkPerfectSquare(int num) {
		int sqrt = (int) Math.sqrt(num);
		if (num == (sqrt * sqrt))
			System.out.println(num + " is a perfect square");
		else
			System.out.println(num + " is not a perfect square");
	}

	public static void main(String[] args) {

		int num1 = 25;
		int num2 = 20;

		Perfect_Square assignment31_2 = new Perfect_Square();
		assignment31_2.checkPerfectSquare(num1);
		assignment31_2.checkPerfectSquare(num2);
	}
}
