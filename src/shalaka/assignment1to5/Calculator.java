// calculator to add sub mul div with parameters
package shalaka.assignment1to5;
class Calculator{

	void add(int num1, int num2){
		int sum = num1 + num2;
		System.out.println("sum of two number is  " + sum);
	}
		
	void sub(int num1, int num2){
		int subAns = num1 - num2;
		System.out.println("sub of two number is  " + subAns);
	}
		
	void mul(int num1, int num2){
		int mulAns = num1 * num2;
		System.out.println("mul of two number is  " + mulAns);
	}
		
	void div(int num1, int num2){
		int divAns = num1 / num2;
		System.out.println("div of two number is  " + divAns);
    }

	public static void main (String [] args){
		Calculator calculator = new Calculator();
		calculator.add(100,200);
		calculator.sub(50,30);
		calculator.mul(10,20);
		calculator.div(40,2);
	}
}
