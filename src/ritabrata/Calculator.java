package ritabrata;
class Calculator{
	
	void add(int num1, int num2){
		int sum = num1 + num2;
		System.out.println("Addition of 2 numbers is: "+ sum);
	}
	
	void sub(int num1, int num2){
		int subAns = num1 - num2;
		System.out.println("Substraction of 2 numbers is: "+ subAns);
	}
	
	void multiply(int num1, int num2){
		int multi = num1 * num2;
		System.out.println("Multiplication of 2 numbers is: "+ multi);
	}
	
	void division(int num1, int num2){
		int div = num1 / num2;
		System.out.println("Division of 2 numbers is: "+ div);
	}
	
	public static void main(String[] args){
		Calculator calculator = new Calculator();
		calculator.add(100,255);
		calculator.sub(250,41);
		calculator.multiply(15,25);
		calculator.division(625,5);
	}
}