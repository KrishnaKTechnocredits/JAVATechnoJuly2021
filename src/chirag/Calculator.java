package chirag;

//Assignment 2
class Calculator{
	
	void add(int num1,int num2){
	
	int sum= num1+num2;
	System.out.println("Sum of two digit numbers is "+ sum);
	}
	
	void sub(int num1,int num2){
	
	int substract = num1-num2;
	System.out.println("Substraction of two digit numbers is "+ substract);
	}
	
	void mul(int num1,int num2){
	
	int multiply = num1*num2;
	System.out.println("Multiplication of two digit numbers is "+ multiply);
	}
	
	void div(int num1,int num2){
	
	int division= num1/num2;
	System.out.println("Diviion of two digit numbers is "+ division);
	}
	
	public static void main(String[]args){
	
	Calculator calculator=new Calculator();
	calculator.add(10,20);
	calculator.sub(100,2);
	calculator.mul(40,60);
	calculator.div(200,4);
	}
	
}
