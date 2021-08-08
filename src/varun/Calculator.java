//WAP for Calculator ?
package varun;
class Calculator{
	
	int x = 10;
	int y = 5;
	
	void sum(){
		int z = x+y;
		System.out.println("Sum of x+y is " +z);
	}
	
	void sub(){
		int z = x-y;
		System.out.println("Sub of x-y is " +z);
	}
	
	void mul(){
		int z = x*y;
		System.out.println("Sub of x*y is " +z);
	}
	
	void div(){
		int z = x/y;
		System.out.println("Sub of x/y is " +z);
	}
	
	public static void main(String []args){
		Calculator calculator = new Calculator();
		calculator.sum();
		calculator.sub();
		calculator.mul();
		calculator.div();
	}
}