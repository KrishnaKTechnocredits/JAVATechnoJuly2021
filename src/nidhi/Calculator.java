package nidhi;

class  Calculator
{

	void add(int x, int y)
	{
		System.out.println("Addition is " + (x+y));
	}
	
	void sub(int x, int y)
	{
		System.out.println("Substraction is " + (x-y));
	}
	
	void mul(int x, int y)
	{
		System.out.println("Multiplication is " + (x*y));
	}
	
	void div(int x, int y)
	{
		System.out.println("Division is " + (x/y));
	}
	
	public static void main(String[] args)
	{
		Calculator calculator = new Calculator();
		calculator.add(10,30);
		calculator.sub(400,50);
		calculator.mul(100,5);
		calculator.div(200,5); 
	}
}