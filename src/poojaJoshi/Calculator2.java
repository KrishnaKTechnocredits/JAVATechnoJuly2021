package poojaJoshi;

class Calculator2{

	void sum (int num1, int num2){
		int sum = num1 + num2;
		System.out.println("Sum of two numbers = " + sum);
	}
	
	void sub (int num1,int num2){
		int sub = num1 - num2;
		System.out.println("sub of two numbers = " + sub);
	}
	
	void multi (int num1,int num2){
		int multi = num1 * num2;
		System.out.println("Multiplication of two numbers = " + multi);
	}
	
	void div (int num1, int num2){
		int div = num1 / num2;
		System.out.println("Division of two numbers = " + div);
	}
	
	public static void main(String[] args){
		Calculator2 calculator2 = new Calculator2();
		calculator2.sum(100,10);
		calculator2.sub(100,50);
		calculator2.multi(10,10);
		calculator2.div(100,50);
	}
}