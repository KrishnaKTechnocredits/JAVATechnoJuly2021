package laxman;

class Calculator{
	int num1 = 10;
	int num2 = 5;
	
	void add( int num1, int num2){
		int sum = num1 + num2;
		System.out.println("Sum of 2 numbers is" + sum);
	}
	void sub(int num1, int num2){
		int subAns = num1 - num2;
		System.out.println("Sub of 2 numbers is" + subAns);
	}
	void mul(int num1, int num2){
		int mulAns = num1 * num2;
		System.out.println("mul of 2 numbers is" + mulAns);
	}
	void div(int num1, int num2){
		int divAns = num1 / num2;
		System.out.println("div of 2 numbers is" + divAns);
	}
	public static void main(String[]args){
			Calculator calculator = new Calculator();
			calculator.add(20,20);
			calculator.sub(20,10);
			calculator.mul(20,20);
			calculator.div(20,10);
	}
}