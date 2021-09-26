package shraddha.BasicExamples;

class Calculator{
	int num1 = 30;
	int num2 = 15;
	
	void addition(){
	int add = num1+num2;
	System.out.println("Addition of two numbers is "+add);
	}
	
	void subtraction(){
	int substract = num1-num2;
	System.out.println("Subtraction of two numbers is "+substract);
	}
	void multiplication(){
	int multiply = num1*num2;
	System.out.println("Multiplication of two numbers is "+multiply);
	}
	void division(){
	int divide = num1/num2;
	System.out.println("Division of two numbers is "+divide);
	}

	public static void main(String[] args){
		Calculator c = new Calculator();
		c.addition();
		c.subtraction();
		c.multiplication();
		c.division();
	}
}