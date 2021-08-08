package indrani;
class Calculator {
	
	void add(int num1 , int num2){
		int sum = num1 + num2;
		System.out.println("Sum of the 2 numbers is " + sum);
	}
	void subtract(int num1 , int num2){
		int sub = num1 - num2;
		System.out.println("Subtraction of the 2 numbers is " + sub);
	}
	void division(int num1 , int num2){
		int div = num1/num2;
		System.out.println("Division of the 2 numbers is " + div);
	}
	void product(int num1 , int num2){
		int mult = num1 * num2;
		System.out.println("Product of the 2 numbers is " + mult);
	}
	public static void main(String[] args){
		Calculator calculator = new Calculator();
		calculator.add(100,75);
		calculator.subtract(200,50);
		calculator.division(700,100);
		calculator.product(100,6);
	}
}