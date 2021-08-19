package margi;

class Assignment_1_Calculator{
	
	void add(int num1, int num2){
		int sum = num1 + num2;
		System.out.println("Sum of 2 numbers is " + sum);
	}
	
	void subtraction(int num1, int num2){
		int subtract = num1 - num2;
		System.out.println("Subtraction of 2 numbers is " + subtract);
	}
	
	void multiplication(int num1, int num2){
		int multiply = num1 * num2;
		System.out.println("Multiplication of 2 numbers is " + multiply);
	}
	
	void division(int num1, int num2){
		int divide = num1 / num2;
		System.out.println("Division of 2 numbers is " + divide);
	}
	
	public static void main(String[] a){
		Assignment_1_Calculator calculator = new Assignment_1_Calculator();
		calculator.add(10,20);
		calculator.subtraction(55,35);
		calculator.multiplication(50,2);
		calculator.division(12,4);
	}
}