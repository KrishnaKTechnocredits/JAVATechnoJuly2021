package chandni_bhojwni;

class Calculator {

    int num1 = 100;
	int num2 = 50;
	
	void add (int num1,int num2) {
		int sum = num1 + num2;
		System.out.println("Sum of 2 numbers is" + sum);
	} 

	void sub (int num1,int num2) {
		int subans = num1 - num2;
		System.out.println("Sub of 2 numbers is" + subans);
	}

	void mul (int num1,int num2) {
		 int mulans = num1 * num2;
		 System.out.println("Mul of 2 numbers is" + mulans);
	}
	
	void div (int num1,int num2) {
		 int divans = num1 / num2;
		 System.out.println("Div of 2 numbers is" + divans);
	}
	
	public static void main (String [] args) {
		Calculator calculator = new Calculator ();
		calculator.add(30,60);
		calculator.sub(155,65);
		calculator.mul(55,85);
		calculator.div(60,120);
	}	
}
   