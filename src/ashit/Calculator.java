package ashit;
class Calculator{
	
	void add(int num1,int num2){
		int sum = num1 + num2;
		System.out.println("Sum of 2 number is " +sum);
	}
	
	void sub(int num1,int num2){
		int sub = num1 - num2;
		System.out.println("Substraction of 2 number is " +sub);
	}
	
	void div(int num1,int num2){
		int div = num1 / num2;
		System.out.println("Division of 2 number is " +div);
	}
	
	void mul(int num1,int num2){
		int mul = num1 * num2;
		System.out.println("Multiplication of 2 number is " +mul);
	}
	
	public static void main(String[] a){
		Calculator calculator = new Calculator();
		calculator.add(100,20);
		calculator.sub(100,20);
		calculator.div(300,30);
		calculator.mul(10,10);
	}
}