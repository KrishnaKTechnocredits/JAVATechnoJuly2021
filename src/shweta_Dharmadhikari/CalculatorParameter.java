//calculator program with parameter
package shweta_Dharmadhikari;
class CalculatorParameter{
	
	void add (int x,int y){
		int sum = x + y;
		System.out.println("Addition of two numbers is: " +sum);
	}

	void sub (int x,int y){
		int sub = x - y;
		System.out.println("Substraction of two numbers is: " +sub);
	}
	
	void multi (int x, int y){
		int multi = x * y;
		System.out.println("Multication of two numbers is: " +multi);
	}
	
	void div (int x, int y){
		int div = x/y;
		System.out.println("Division of two numbers is: " +div);
	}
	
	public static void main(String[] a){
		CalculatorParameter calculatorParameter = new CalculatorParameter();
		calculatorParameter.add(100,10);
		calculatorParameter.sub(120,20);
		calculatorParameter.multi(10,10);
		calculatorParameter.div(100,10);
		
	}
}