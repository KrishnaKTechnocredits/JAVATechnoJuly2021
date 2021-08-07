
package avinash;
class Calculator{
	int num1 = 10;
	int num2 = 20;
	
	void add(){
		int sum = num1 + num2;
		System.out.println("Sum of two number is:"+ sum);
	}
	
	void substract(){
		int sub = num2 - num1;
		System.out.println("Substract of two number is:"+ sub);
	}
	
	void multiple(){
		int mul = num1 * num2;
		System.out.println("multiplication of two number is:"+ mul);
	}
	
	void division(){
		int div = num2 / num1;
		System.out.println("Division of two number is:"+ div);
	}
	
	public static void main(String[] args){
		Calculator calculator = new Calculator();
		calculator.add();
		calculator.substract();
		calculator.multiple();
		calculator.division();	
	}
}