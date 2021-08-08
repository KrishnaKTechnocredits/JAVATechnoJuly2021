class Calculator{
	void add(int x, int y){
		int addition = x + y;
		System.out.println("Addition of two numbers is: " + addition);
	}
	
	void sub(int x, int y){
		int subtraction = x - y;
		System.out.println("subtraction of two numbers is: " + subtraction);
	}
	
	void mult(int x, int y){
		int multiplication = x * y;
		System.out.println("Multiplication of two numbers is: " + multiplication);
	}
	
	void div(int x, int y){
		int division = x / y;
		System.out.println("Division of two numbers is: " + division);
	}
	
	public static void main(String[] a){
		Calculator calculator = new Calculator();
		calculator.add(10, 11);
		calculator.sub(51,30);
		calculator.mult(6,4);
		calculator.div(22,2);
	}
}

	