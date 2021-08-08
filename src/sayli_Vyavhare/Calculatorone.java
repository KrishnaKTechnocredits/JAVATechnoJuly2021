package sayli_Vyavhare;

class Calculatorone{
	
	void add(int num1,int num2){
		int sum=num1+num2;
		System.out.println("Sum is:"+sum);
	}
	
	void subtract(int num1,int num2){
		int sub=num1-num2;
		System.out.println("Subtraction is:"+sub);
	}
	
	void division(int num1,int num2){
		int div=num1/num2;
		System.out.println("Division is:"+div);
	}
	
	void multiply(int num1,int num2){
		int mul=num1*num2;
		System.out.println("Multiplication is:"+mul);
	}

	public static void main (String[] args){
		Calculatorone calculatorone= new Calculatorone();
		calculatorone.add(20,2);
		calculatorone.subtract(23,6);
		calculatorone.division(60,3);
		calculatorone.multiply(60,3);
	
	}	
}