package husain;

class CalculatorArgs {


	void add(int x , int y) {
		int sum = x + y;
		System.out.println("Sum of these two numbers is : " + sum);
	}

	void sub(int x, int y) {
		int sub = x - y;
		System.out.println("Difference between these two numbers is : " + sub);
	}

	void multiplication(int x, int y) {
		int mult = x * y;
		System.out.println("Product of these two numbers is : " + mult);
	}

	void division(int x, int y) {
		int div = x / y;
		System.out.println("Quotient of these two numbers is : " + div);

	}

	public static void main(String[] args) {
		CalculatorArgs calc = new CalculatorArgs();
		calc.add(10, 20);
		calc.sub(50, 30);
		calc.multiplication(25, 26);
		calc.division(150, 15);
	}
}