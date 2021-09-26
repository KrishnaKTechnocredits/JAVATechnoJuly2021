package madhavi;

public class Assignment_26_3 {
	void getSwapNumber(int num1, int num2) {
		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("Numbers after swap " + num1 + " " + num2);
	}

	public static void main(String[] args) {
		Assignment_26_3 assignment_26_3 = new Assignment_26_3();
		int a = 10;
		int b = 20;
		System.out.println("Number before Swap " + a + " " + b);
		assignment_26_3.getSwapNumber(a, b);

	}
}