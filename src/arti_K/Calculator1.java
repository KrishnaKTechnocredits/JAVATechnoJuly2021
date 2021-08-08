/* Assignment No 1 - 1st Aug 
 Calculator functions using parametarized methods: */

package arti_K;


class Calculator1 {
	
	
	void add(int num1, int num2){
		int sum = num1 + num2;
		System.out.println("Sum of 2 numbers : "+sum);
	}
	
	void sub(int num1, int num2){
		int sum = num1 - num2;
		System.out.println("Substraction of 2 numbers : "+sum);
	}
	
	void mul(int num1, int num2){
		int sum = num1 * num2;
		System.out.println("Multiplication of 2 numbers : "+sum);
	}
	
	void div(int num1, int num2){
		int sum = num1 / num2;
		System.out.println("Division of 2 numbers : "+sum);
	}
	
	public static void main(String[] args){
		Calculator1 calculator1 = new Calculator1();
		calculator1.add(10,20);
		calculator1.sub(50,30);
		calculator1.mul(2,8);
		calculator1.div(9,3);
	}
}