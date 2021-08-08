package nishi;

//Assignment : add other 3 method of calculator class like sub(),div(),mul(),do it using parameters

class  Calculator{
	
	void add(int num1,int num2){
		int sum = num1 + num2;
		System.out.println("Sum of 2 numbers is "+ sum);
	}
	
	void sub(int num1,int num2)
	{
		int diff = num1 - num2;
		System.out.println("Subtraction of 2 numbers is "+ diff);
	}
	
	void mul(int num1,int num2)
	{
		int muliplication = num1 * num2;
		System.out.println("Multiplication of 2 numbers is "+ muliplication);
	}
	
	void div(int num1,int num2)
	{
		int division = num1/num2;
		System.out.println("Division of 2 numbers is "+ division);
	}
	
	public static void main(String[] args)
	{
		Calculator calculator = new Calculator();
		calculator.add(10,15);
		calculator.sub(100,30);
		calculator.mul(100,3);
		calculator.div(100,20);
	}
	
}