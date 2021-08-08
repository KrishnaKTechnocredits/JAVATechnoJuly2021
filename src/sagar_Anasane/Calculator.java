package sagar_Anasane;

class Calculator{
	
	void add(int num1, int num2){
		int sum = num1 + num2 ;
		System.out.println("Addition of two no's = "+ sum);
	}
	
	void sub(int num1, int num2){
		int sub = num1 - num2 ;
		System.out.println("Substraction of two no's = "+ sub);
	}	
	
	void mult(int num1, int num2){
		int mult = num1 * num2 ;
		System.out.println("Multiplication of two no's = "+ mult);	
	}
	
	void div(int num1,int num2){
		int div = num1 / num2 ;
		System.out.println("Division of two no's = "+ div);
	}
	public static void main(String[] a){
		Calculator calculator = new Calculator();
		calculator.add(20,30);
		calculator.sub(50,25);
		calculator.mult(10,20);
		calculator.div(20,10);
	}
}