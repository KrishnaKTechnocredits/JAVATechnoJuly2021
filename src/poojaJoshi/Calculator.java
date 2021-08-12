package poojaJoshi;


class Calculator{
	int num1 = 10;
	int num2 = 5;
	
	void add(){
		int sum = num1 + num2;
		System.out.println("sum of 2 numbers is " + sum);
	}
	
	void sub(){
		int Sub = num1 - num2;
		System.out.println("sub of 2 numbers is " + Sub);
	}
	
	void multi(){
		int multi = num1 * num2;
		System.out.println("Multiplication of 2 numbers is " + multi);
	}
	
	void div(){
		int div = num1 / num2;
		System.out.println("Division of 2 numbers is " + div);
	}
	public static void main(String[] args){
		Calculator calculator = new Calculator();
		calculator.add();
		calculator.sub();
		calculator.multi();
		calculator.div();
	}
}