package madhavi;

public class Assignment_30_5 {
	int SquareRootNo;

	void checkPerfectSquare(int number) {
		if (number >= 0) {
			SquareRootNo = (int) Math.sqrt(number);
		}
		if ((SquareRootNo * SquareRootNo) == number) {
			System.out.println(number + " is Perfect Square Number!");
		} else {
			System.out.println(number + " is not Perfect Square Number!");
		}

	}
	public static void main(String[] args) {
		Assignment_30_5 assignment_30_5 = new Assignment_30_5();
		System.out.println(".....Verify given number is a perfect square or not.......");
		int num1 = 49;
		assignment_30_5.checkPerfectSquare(num1);
		int num2 = 101;
		assignment_30_5.checkPerfectSquare(num2);

	}
}