package jagrati;

public class Calculator {
	
	void add(int x, int y){
	
		int sum = x + y ;
		System.out.println("sum of 2 number is " + sum);
	}		
	void sub(int x, int y){
	
		int sub = x - y;
		System.out.println("substraction of 2 number is " + sub);
	}
	void multi(int x, int y){
		
		int multi = x * y;
		System.out.println("multiplication of 2 number is " + multi);
	}
	void div(int x, int y){
		
		int div = x/y;
		System.out.println("Division of 2 number is " + div);
	}	
	public static void main(String[] a){
		Calculator calculator = new Calculator();
		calculator.add(23,20);
		calculator.sub(40,30);
		calculator.multi(20,10);
		calculator.div(40,2);
		
	}
		
}