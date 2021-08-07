package monika;

class Calculator{
	void add(int num1, int num2){
		int sum=num1+num2;
		System.out.println("\nAddition of two digits="+sum);
	}
	void sub(int num1,int num2){
		int sub=num1-num2;
		System.out.println("Substraction of two digits="+sub);
	}
	void mul(int num1,int num2){
		int mul=num1*num2;
		System.out.println("Multiplication of two numbers="+mul);
	}
	void div(int num1,int num2){
		int div=num1/num2;
		System.out.println("Division of two numbers-"+div);
	}
	public static void main(String[] a){
		Calculator calculator=new Calculator();
		calculator.add(10,20);
		calculator.sub(30,10);
		calculator.mul(40,20);
		calculator.div(20,4);
		
	}
	
}