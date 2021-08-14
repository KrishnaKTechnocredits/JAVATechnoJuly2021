package ashutosh;

class Calculator{
	void add(int a, int b){
		int sum = a+b;
		System.out.println("Addition is: " +sum);
	}
	
	
	void sub(int a, int b){
		int sub = a-b;
		System.out.println("Substraction is: " +sub);
	}
	
	
	void div (int a, int b){
		int div = a/b;
		System.out.println("Division is: " +div);
	}
	
	void mul(int a, int b){
		int mul = a*b;
		System.out.println("Multiplication is: " +mul);
	}
	
	public static void main(String[] a){
		Calculator c1 = new Calculator();
		c1.add(5,9);
		c1.sub(20,15);
		c1.mul(12,5);
		c1.div(15,5);

	}
	
	
	
}