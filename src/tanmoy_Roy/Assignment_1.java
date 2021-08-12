package tanmoy_Roy;

class Assignment_1{

	void add(int num1,int num2){
		int add = num1 + num2;
		System.out.println("The addition of num1 and num2 is "+ add);
	}
	
	void sub(int num1,int num2){
		int sub = num1 - num2;
		System.out.println("The subtraction of num1 and num2 is "+ sub);
	}
	
	void multiply(int num1,int num2){
		int multiply = num1 * num2;
		System.out.println("The multiply of num1 and num2 is "+ multiply);
	}
	
	void divide(int num1,int num2){
		int divide = num1 / num2;
		System.out.println("The division of num1 and num2 is "+ divide);
	}
	
	public static void main(String[] args){
		Calculator calculator = new Calculator();
		calculator.add(20,36);
		calculator.sub(12,6);
		calculator.multiply(7,8);
		calculator.divide(36,4);
	}
}