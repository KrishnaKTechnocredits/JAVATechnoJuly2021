package parthav;

class Calculator{
	
	void add(int num1, int num2){
		int sum = num1 + num2;
		System.out.println("Addition of 2 numbers num1 and num2 is: " + sum);
	}
	
	void subtract(int num1, int num2){
		int subtract = num1 - num2;
		System.out.println("Subtraction of 2 numbers num1 and num2 is: " + subtract);
	}
	
	void multiplication(int num1, int num2){
		int mult = num1 * num2;
		System.out.println("Multiplication of 2 numbers num1 and num2 is: " + mult);
	}
	
	void division(int num1, int num2) {
		int division = num1 / num2;
		System.out.println("Division of 2 numbers num1 and num2 is: " + division);
	}
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.add(10, 20);
		calculator.subtract(20, 15);
		calculator.multiplication(10, 10);
		calculator.division(50, 10);
	}
	
}