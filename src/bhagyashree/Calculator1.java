package bhagyashree;
class Calculator1
{
	int num1=100;
	int num2=200;
	
	void sum()
	{
		int ans=num1+num2;
		System.out.println("Sum of 2 numbers is:  " +ans);
	}
	
	void substraction()
	{
		int ans=num1-num2;
		System.out.println("Subs of 2 numbers is:  " +ans);
	}
	
	void multiplication()
	{
		int  ans=num1*num2;
		System.out.println("Multiplication of 2 numbers is:  " +ans);
	}
	void division()
	{
		int  ans=num1/num2;
		System.out.println("Division of 2 numbers is:  " +ans);
	}
	
	public static void main(String[] args)
	{
		Calculator1 calculator1=new Calculator1();
		calculator1.sum();
		calculator1.substraction();
		calculator1.multiplication();
		calculator1.division();
	}
	
}