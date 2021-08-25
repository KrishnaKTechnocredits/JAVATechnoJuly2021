package deepak.deepakkankhar;

class Calculator1{
	
	void add(int num1, int num2){
		int sum=num1+num2;
		System.out.println("Addition of the numbers is: "+sum);
	}
	
	void sub(int num1, int num2){
		int sub=num1-num2;
		System.out.println("Addition of the numbers is: "+sub);
	}
	
	void div(int num1, int num2){
		int div=num1/num2;
		System.out.println("Addition of the numbers is: "+div);
	}
	
	void mul(int num1, int num2){
		int mul=num1*num2;
		System.out.println("Addition of the numbers is: "+mul);
	}
	
	
	
	public static void main(String[] a){
			Calculator1 calculator=new Calculator1();
			calculator.add(60,30);
			calculator.sub(90,60);
			calculator.div(60,2);
			calculator.mul(60,2);
			
	}
}