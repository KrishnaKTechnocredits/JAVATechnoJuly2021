//Assignment 1 CalculatorProgram
package indu;

class Calculator
{
	int num1 =50;
	int num2 =25;
	
	void add()
	{
		int sum = num1 + num2;
		System.out.println("Sum of " +num1 + " and "+num2 +" = " +sum);
	}
	
	void sub()
	{
		int substract = num1 - num2;
		System.out.println("Substraction of "+num1 +  " and "+num2 + " = " +substract);
	}
	
	void mul()
	{
		int multiplication = num1 * num2;
		System.out.println("Multiplication of " + num1 + " and "+num2 +" = " +multiplication);
	}
	
	void div()
	{
		int division = num1 / num2;
		System.out.println("Division of "+num1 + " and "+num2 +" = " +division);
	}
	
	public static void main(String[] c)
	{
		Calculator calculator = new Calculator();
		calculator.add();
		calculator.sub();
		calculator.mul();
		calculator.div();
	}
}