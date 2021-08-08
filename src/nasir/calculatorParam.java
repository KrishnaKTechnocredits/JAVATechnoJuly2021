package nasir;

class CalculatorParam{
	
	void add(int x, int y){
		int sum= x+y;
		System.out.println("Sum of 2 number is "+ sum);
	}
	
	void sub(int x, int y){
		int subAns= x-y;
		System.out.println("sub of 2 number is "+ subAns);
	}
	
	void mul(int x, int y){
		int mulAns= x*y;
		System.out.println("mul of 2 number is "+ mulAns);
	}
	
	void div(int x, int y){
		int divAns= x/y;
		System.out.println("div of 2 number is "+ divAns);
	}
	
	public static void main(String[] args){		

		CalculatorParam calculatorParam = new CalculatorParam();
		calculatorParam.add(20,30);
		calculatorParam.sub(30,10);
		calculatorParam.mul(20,10);
		calculatorParam.div(60,10);		
		
	}

}