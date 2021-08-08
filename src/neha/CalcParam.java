package neha;
//Assignment 1- 1st Aug 2021
class CalcParam{
	int num1 = 10;
	int num2 = 5;
	
	void add(int num1,int num2){
		int sum = num1 + num2;
		System.out.println("Sum of two numbers is "+sum);
	}
	 
	void subr(int num1,int num2){
		int sub = num1 - num2;
		System.out.println("Subtraction of two numbers is "+sub);
	}
	
	void mul(int num1,int num2){
		int multi = num1*num2;
		System.out.println("Multiplication of two numbers is "+multi);
	}
	
	void div(int num1,int num2){
		int divs = num1/num2;
		System.out.println("Division by two numbers is "+divs);
	}
	
	public static void main(String[] args){
		CalcParam CalcParam = new CalcParam();
		CalcParam.add(10,20); //addition
		CalcParam.add(20,5);
		CalcParam.subr(25,5); //subtraction
		CalcParam.subr(30,15);
		CalcParam.mul(20,10); //multiplication
		CalcParam.mul(15,10);
		CalcParam.div(200,20); //division
		CalcParam.div(15,5);
	}

}

