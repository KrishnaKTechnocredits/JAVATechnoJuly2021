package ankita;
class Calculator{
	
	void add(int num1,int num2){
		int sum=num1+num2;
		System.out.println(" sum of 2 no is "+ sum);
	}
	
	void sub(int num1,int num2){
		int sub=num1-num2;
		System.out.println(" Sub of 2 no is "+ sub);
	}
	
	void mul(int num1,int num2){
		int mul=num1*num2;
		System.out.println(" multiplication of 2 no is "+ mul);
	}
	
	void div(int num1,int num2){
		int div=num1/num2;
		System.out.println(" division of 2 no is "+ div);
	}
	
	public static void main(String[] args){
		Calculator calculator = new Calculator();
		calculator.add(10,20);
		calculator.sub(100,20);
		calculator.mul(10,20);
		calculator.div(10,2);
		
	}   
}
