package prajwal;

class Calculator{
	
	void addition(int num1, int num2){
		int sum = num1 + num2;
		System.out.println(" sum of 2 number is " + sum);
	}
	
	void subtraction(int num1, int num2){
		int sub= num1 - num2;
		System.out.println(" subtraction of 2 number is " + sub);
	}
	
	void multiplication(int num1, int num2){
		int mult= num1 * num2;
		System.out.println(" Multiplication of 2 number is " + mult);
	}
	
	void division(int num1, int num2){
		int div= num1 / num2;
		System.out.println("Division of 2 number is " + div);
	}
	
	public static void main(String[] a){
		Calculator calculator = new Calculator();
		calculator.addition(20,30);
		calculator.subtraction(30,10);
		calculator.multiplication(50,20);
		calculator.division(20,10);
	}
	
	
}