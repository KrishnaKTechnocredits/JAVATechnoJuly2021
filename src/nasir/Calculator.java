package nasir;

class Calculator{
	int x=10;
	int y=11;
	
	void add()
	{
		int add=x+y;
		System.out.println("addition ="+ add);	
	}
	void sub()
	{
		int sub=x-y;
		System.out.println("Sub ="+ sub);
	}
	void div()
	{
		int div=x/y;
		System.out.println("div ="+ div);
	}
	void mul()
	{
		int mul=x*y;
		System.out.println("mul ="+ mul);
	}

	public static void main(String[] args)
	{
		Calculator calc = new Calculator();
		calc.add();
		calc.sub();
		calc.div();
		calc.mul();
		
	}


}