package precilla;

class CalculatorParameterized{
	//addition
	void add(int num1,int num2)
	{
		int sum=num1+num2;
		System.out.println("sum of 2 numbers are "+sum);
	}
	//subtraction
	void sub(int  num1,int num2)
	{
		int sub=num1-num2;
		System.out.println("sub of 2 numbers are "+sub);
	}
	//multiplication
	void mul(int  num1,int num2)
	{
		int mul=num1*num2;
		System.out.println("Multiplication of 2 numbers are "+mul);
	}
	//division
	void div(int num1,int num2)
	{
		int div=num1/num2;
		System.out.println("Division of two numbers are " +div);
	}
	public static void main(String[] args)
	{
		CalculatorParameterized calculatorParameterized=new CalculatorParameterized();
		calculatorParameterized.add(10,20);//30
		calculatorParameterized.sub(50,30);//20
		calculatorParameterized.mul(25,25);//625
		calculatorParameterized.div(60,30);//2
	}
}