//Assignment 1
package anuja;

class Calculator{
	int num1=10;
	int num2=5;
	
	void add(){
		int sum=num1+num2;
		System.out.println("Sum of 2 nos is "+ sum);
		
	}
	
	void sub(){
		int sub=num1-num2;
		System.out.println("Diff of 2 nos is "+ sub);
		
	}
	
	void mul(){
		int mul=num1*num2;
		System.out.println("Mul of 2 nos is "+ mul);
		
	}
	
	void div(){
		int div=num1/num2;
		System.out.println("Div of 2 nos is "+ div);
		
	}
	
	public static void main(String []a){
		Calculator calculator=new Calculator();
		calculator.add();
		calculator.sub();
		calculator.mul();
		calculator.div();
		
	}
	
	


}