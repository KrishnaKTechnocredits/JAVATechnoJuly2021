package amol_Pawar;
class Calculator{

	void add(int num1,int num2){
		int addAns=num1+num2;
		System.out.println("Sum of two numbers is : "+addAns);
	}
	
	void sub(int num1,int num2){
		int subAns=num1-num2;
		System.out.println("Substraction of two numbers is : "+subAns);
	}
	
	void mul(int num1,int num2){
		int mulAns=num1*num2;
		System.out.println("Multiplication of two numbers is : "+mulAns);		
	}
	
	void div(int num1,int num2){
		int divAns=num1/num2;
		System.out.println("Division of two numbers is : "+divAns);
	}
	
	public static void main(String[] args)
	{
		Calculator calculator=new Calculator();
		calculator.add(20,10);
		calculator.sub(20,10);
		calculator.mul(20,10);
		calculator.div(20,10);	
	}
}