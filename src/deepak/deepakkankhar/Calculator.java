package deepak.deepakkankhar;

class Calculator{
	int num1=10;
	int num2=5;
	
	void add(){
		int sum=num1+num2;
		System.out.println("Sum of the numbers is: "+sum);
	}
	
	void sub(){
		int sub=num1-num2;
		System.out.println("Substraction of the numbers is: "+sub);
	}
	
	void div(){
		int div=num1/num2;
		System.out.println("Division of the numbers is: "+div);
	}
	
	void mul(){
		int mul=num1*num2;
		System.out.println("Multiplication of the numbers is: "+mul);
	}
	
	public static void main(String[] a){
		Calculator calculator=new Calculator();
		calculator.add();
		calculator.sub();
		calculator.div();
		calculator.mul();
	
	}
}