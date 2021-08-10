//Assignment 2 CalculatorProgram with parameters
package indu;

class Calculator2
{
	
	void add(int num1, int num2)
	{
		int sum = num1 + num2;
		System.out.println("Sum of " +num1 + " and "+num2 +" = " +sum);
	}
	
	void sub(int num1, int num2)
	{
		int substract = num1 - num2;
		System.out.println("Substraction of "+num1 +  " and "+num2 + " = " +substract);
	}
	
	void mul(int num1, int num2)
	{
		int multiplication = num1 * num2;
		System.out.println("Multiplication of " + num1 + " and "+num2 +" = " +multiplication);
	}
	
	void div(int num1, int num2)
	{
		int division = num1 / num2;
		System.out.println("Division of "+num1 + " and "+num2 +" = " +division);
	}
	
	public static void main(String[] c)
	{
		Calculator2 calculator = new Calculator2();
		calculator.add(11,52);
		calculator.sub(55,22);
		calculator.mul(87,36);
		calculator.div(50,25);
	}
}