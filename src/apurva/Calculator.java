package apurva;

class Calculator{
	
	
	void sum(int num1,int num2){
		int add = num1+num2;
		System.out.println("Addition of two numbers is:" +add);
	}
	
	void subtract(int num1, int num2){
		int sub = num1-num2;
		System.out.println("Subtraction  of two numbers is:" +sub);
	}
	
	void multiply(int num1, int num2){
		int mul = num1*num2;
		System.out.println("Multiplication of two numbers is:" +mul);
	}
	
	void division(int num1, int num2){
		int divi = num1/num2;
		System.out.println("Division of two numbers is:" +divi);
	}
	
	public static void main(String[] args){
		Calculator calculator = new Calculator();
		calculator.sum(2,3);
		calculator.subtract(3,3);
		calculator.multiply(3,3);
		calculator.division(3,3);	
	}
}
