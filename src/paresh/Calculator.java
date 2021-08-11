package paresh;

class Calculator{
	
	void add(int num1, int num2){
		int addition= num1+num2;
		System.out.println("Addition is: " + addition);
	}
	
	void sub(int num1, int num2){
		int substraction= num1-num2;
		System.out.println("Substraction is: " + substraction);
	}
	
	void multi(int num1, int num2){
		int multiplication= num1*num2;
		System.out.println("Multiplication is: " + multiplication);
	}
	
	void div(int num1, int num2){
		int division= num1/num2;
		System.out.println("Division is: "+ division);
	}	
	
	public static void main(String[] args){
		Calculator calculator = new Calculator ();
		calculator.add(20,10);
		calculator.sub(50,10);
		calculator.multi(30,5);
		calculator.div(200,10);
		
	}
}