package kalpesh;

class Calculator3{
	
	void add(int num1, int num2){
		int sum = num1 + num2;
		System.out.println("Addition of two numbers is "+sum);
	}
	void sub(int num1, int num2){
		int sub = num1 - num2;
		System.out.println("Suntraction of two numbers is "+sub);
	}
	void mul(int num1, int num2){
		int mul = num1 * num2;
		System.out.println("Multiplication of two numbers is "+mul);
	}
	void div(int num1, int num2){
		int div = num1 / num2;
		System.out.println("Division of two numbers is "+div);
	}
	
	public static void main(String[] a){
		Calculator3 calculator_1 = new Calculator3(); 
		calculator_1.add(20,50);
		calculator_1.sub(30,12);
		calculator_1.mul(20,9);
		calculator_1.div(50,2);
	} 
	
	
	
}