package vivek.Assignment26;

public class Assignment26_4 {

	void swapTwoNumbers(int num1, int num2) {
		System.out.println("Numbers before swapping " + "num1 = " + num1 + " num2 = " + num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = (num1 + num2) / 2;
		num2 = (num1 - num2) / 2;
		System.out.println("Numbers after swapping " + "num1 = " + num1 + " num2 = " + num2);
	}

	public static void main(String[] args) {
		Assignment26_3 assignment26_3 = new Assignment26_3();
		assignment26_3.swapTwoNumbers(10, 20);
	}
}
