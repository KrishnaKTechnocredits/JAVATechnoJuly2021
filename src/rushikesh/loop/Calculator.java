package rushikesh.loop;

class Calculator{
	
	void add(int num1,int num2){
		int sum= num1 + num2;
		System.out.println("Addition is "+sum);
	}
	
	void sub(int num1,int num2){
		int sub= num1 - num2;
		System.out.println("Substraction is "+sub);
	}
	
	void mul(int num1,int num2){
		int mul= num1 * num2;
		System.out.println("Multiplication is "+mul);
	}
	
	void div(int num1,int num2){
		int div= num1 / num2;
		System.out.println("Division is "+div);
	}
	
	public static void main(String[] args){
		Calculator calculator= new Calculator();
		calculator.add(15,10);
		calculator.sub(15,10);
		calculator.mul(15,10);
		calculator.div(15,10);
	}
}	
		