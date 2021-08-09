package sayali_V;

public class Calc {

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
		Calc calc = new Calc();
		calc.add(10, 40);
		calc.subtract(20, 15);
		calc.multiplication(20, 10);
		calc.division(65, 5);
	}	
}