package umakant;
class Calculator{
	
	void add(int number1,int number2){
		int sum = number1+number2;
		System.out.println("Sum of two numbers is "+sum);
	}
	
	void substract(int number1,int number2){
		int difference = number1-number2;
		System.out.println("Difference of two numbers is "+difference);
	}
	
	void multiplication(int number1,int number2){
		int mul = number1*number2;
		System.out.println("Multiplication of two numbers is "+mul);
	}
	
	void division(int number1,int number2){
		int div = number1/number2;
		System.out.println("Division of two numbers is "+div);
	}
	
	public static void main(String[] args){
		Calculator calculator = new Calculator();
		calculator.add(20,10);
		calculator.substract(30,20);
		calculator.multiplication(40,30);
		calculator.division(50,25);
	}
}