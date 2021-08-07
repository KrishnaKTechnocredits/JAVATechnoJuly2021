// Calculator program
package suruchi;

class Calculator{

	int num1 = 10;
	int num2 = 5;
	
	void add(){
		int sum = num1 + num2;
		System.out.println("Sum of 2 numbers is: " + sum);
	}
	
	void sub(){
		int sub = num1 - num2;
		System.out.println("Subtraction of 2 numbers is: " + sub);
	}
	
	void mul(){
		int mul = num1 * num2;
		System.out.println("Multiplication of 2 numbers is: " + mul);
	}
	
	void div(){
		int div = num1 / num2;
		System.out.println("Division of 2 numbers is: " + div);
	}
	
	public static void main(String[] a){
		Calculator calculator = new Calculator();
		calculator.add();
		calculator.sub();
		calculator.mul();
		calculator.div();
	}

}