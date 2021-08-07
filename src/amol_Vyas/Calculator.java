package amol_Vyas;

class Calculator{
	
	void add(int num1, int num2){
		int sum = num1 + num2;
		System.out.println("The sum of two numbers is " + sum);
	}
	
	void sub(int num1, int num2){
		int sub = num1 - num2;
		System.out.println("The Subtraction of two numbers is " + sub);
	}
	
	void multiply(int num1, int num2){
		int mul = num1 * num2;
		System.out.println("The multiplication of two numbers is " + mul);
	}
	
	void division(int num1, int num2){
		int div = num1 / num2;
		System.out.println("The division of two numbers is " + div);
	}
	
	public static void main(String[] a){
		Calculator calculator = new Calculator();
		calculator.add(10,10);
		calculator.sub(100,45);
		calculator.multiply(10,10);
		calculator.division(10,5);
	}
}