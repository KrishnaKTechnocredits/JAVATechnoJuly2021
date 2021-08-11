package poojaJoshi;


class Calculator1{

	void add (int num1, int num2){
		int sum = num1 + num2;
		System.out.println("Sum of two numbers is " +sum);
	}
	
	void sub (int num1, int num2){
		int sub = num1 - num2;
		System.out.println("sub of two numbers is " +sub);
	}
	
	void multi (int num1, int num2){
		int multi = num1 * num2;
		System.out.println("Multiplication of two numbers is " +multi);
	}
	
	void div (int num1, int num2){
		int div = num1 + num2;
		System.out.println("Division of two numbers is " +div);
	}
	
	public static void main (String[] args){
		Calculator1 calculator1 = new Calculator1();
		calculator1.add(20,10);
		calculator1.add(15,15);
		calculator1.sub(15,15);
		calculator1.multi(15,15);
		calculator1.div(15,15);
	}
}