// Calculator with Parameters

package chaitanya;

class Calculator{
	
	void add(int x, int y){
		int z = x+y;
		System.out.println("Sum of 2 Integers " + x + " & " + y + " : " + z);
	}
	
	void subtract(int x, int y){
		int z = x-y;
		System.out.println("Difference of 2 Integers " + x + " & " + y + " : " + z);
	}
	
	void product(int x, int y){
		int z = x*y;
		System.out.println("Product of 2 Integers " + x + " & " + y + " : " + z);
	}
		
	void quotient(int x, int y){
		int z = x/y;
		System.out.println("Quotient of 2 Integers " + x + " & " + y + " : " + z);
	}
	
	public static void main (String[] args) {
		Calculator calculator = new Calculator();
		calculator.add(20,30);
		calculator.subtract(50,30);
		calculator.product(100,20);
		calculator.quotient(15,5);
	}
}