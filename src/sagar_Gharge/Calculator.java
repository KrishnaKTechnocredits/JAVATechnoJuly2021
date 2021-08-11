package sagar_Gharge;

class Calculator {

	void add (int x, int Y) {
	int add = x + Y;
	System.out.println ("Sum of 2 number is " + add);
	
	}
	
	void sub (int X, int Y) {
	int sub = X - Y;
	System.out.println ("Substraction of 2 number is " + sub);
	
	}
	
	void multi (int X, int Y){
	int multi =  X * Y;
	System.out.println ("Multiplication of 2 Number is " + multi);
	
	}
	
	void Div (int X, int Y){
	int Div = X / Y;
	System.out.println ("Division of 2 Number is " + Div);
   }
	public static void main (String[] args){
	
	Calculator Calculator = new Calculator();
	Calculator.add(100,200);
	Calculator.sub(500,200);
	Calculator.multi(10,20);
	Calculator.Div(1000,10);
	
	}
}