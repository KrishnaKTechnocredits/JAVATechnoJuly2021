// WAP for calculator by passing value from the object ?
package varun;

class CalculatorWithObectValues {

	void sum(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("Sum of num1 & num2 is " + sum);
	}

	void sub(int num1, int num2) {
		int sub = num1 - num2;
		System.out.println("Subtraction of num1 & num2 is " + sub);
	}

	void mul(int num1, int num2) {
		int mul = num1 * num2;
		System.out.println("Multiplication of num1 & num2 is " + mul);
	}

	void div(int num1, int num2) {
		int div = num1 / num2;
		System.out.println("division of num1 & num2 is " + div);
	}

	public static void main(String[] args) {
		CalculatorWithObectValues calculatorWithObectValues = new CalculatorWithObectValues();
		calculatorWithObectValues.sum(10, 20);
		calculatorWithObectValues.sub(55, 37);
		calculatorWithObectValues.mul(5, 45);
		calculatorWithObectValues.div(100, 25);
	}
}