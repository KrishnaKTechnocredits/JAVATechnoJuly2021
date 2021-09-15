package madhavi;

public class Assignment_26_4 {
	void getSwapNumber(int num1, int num2) {
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;

		System.out.println("Numbers after swap " + num1 + " " + num2);
	}

	public static void main(String[] args) {
		Assignment_26_4 assignment_26_4 = new Assignment_26_4();
		int a = -1;
		int b = 20;
		System.out.println("Number before Swap " + a + " " + b);
		assignment_26_4.getSwapNumber(a, b);

	}
}
