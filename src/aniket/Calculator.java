package aniket;
class Calculator{

	int num1;
	int num2;
	
	void add(int num1,int num2){
		int sum= num1+num2;
		System.out.println("Addition of two number is " + sum);
	
	}
	
	void sub(int num1,int num2){
		int subValue=num1-num2;
		System.out.println("subtraction of two number is " + subValue);
		
	}
	
	void mul(int num1,int num2){
		int mul =num1*num2;
		System.out.println("Multiplication of two number is " + mul);
		
	}
	
	void div(int num1,int num2){
		int div =num1/num2;
		System.out.println("Multiplication of two number is " + div);
		
	}
	
	public static void main(String[] args){
		Calculator calculator =new Calculator();
		calculator.add(10,20);
		calculator.sub(20,10);
		calculator.mul(10,10);
		calculator.div(20,2);
		
	}
	
	

}