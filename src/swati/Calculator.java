//Calculator with 4 functions
package swati;

class Calculator{
	
	void addition(int num1,int num2){
		int sum =num1+num2;
		System.out.println("Addition of two Number:" +sum);
	}
	
	void subtraction(int num1,int num2){
		int sub=num1-num2;
		System.out.println("Substraction of two Number:" +sub);
	}
	
	void multiplication(int num1,int num2){
		int mul=num1*num2;
		System.out.println("Multiplication of two Number:" +mul);
	}
	
	void division(int num1,int num2){
		int div=num1/num2;
		System.out.println("Division of two Number:" +div);
	}
	
	public static void main(String[] a){
	Calculator calculator = new Calculator();
	calculator.addition(10,5);
	calculator.subtraction(10,5);
	calculator.multiplication(10,2);
	calculator.division(25,5);
	}
}