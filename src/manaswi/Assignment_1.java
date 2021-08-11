package manaswi;

public class Assignment_1
{
	void add(int num1, int num2)
	{
		int add = num1 + num2;
		System.out.println(add);
	}
	
	void sub(int num1, int num2)
	{
		int sub = num1 - num2;
		System.out.println(sub);
	}
	
	void mul(int num1, int num2)
	{
		int mul = num1 * num2;
		System.out.println(mul);
	}
	
	void div(int num1, int num2)
	{
		int div = num1/num2;
		System.out.println(div);
	}
	
	public static void main(String[] args)
	{
		Assignment_1 calculator = new Assignment_1();
		calculator.add(30,10);
		calculator.sub(40,5);
		calculator.mul(5,2);
		calculator.div(50,10);
	}
}