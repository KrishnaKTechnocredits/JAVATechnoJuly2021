package bhakti;
class Calculator{
	
	void add(int num1, int num2){
		int sum = num1 +num2;
		System.out.println ("Sum of two number are " +sum);
	}	

	void difference(int num1, int num2){
		int diff = num1 - num2;
		System.out.println("Difference of two number is " +diff);
	}
		
	void mulTwo(int num1, int num2){
		int mul= num1 * num2;
		System.out.println("Multiplication of two number is " +mul);
	}
	
	void division(int num1, int num2){
		int div = num1/ num2;
		System.out.println("Division of two number is " +div);
	}
	
	static public void main (String [] a){
		Calculator calculator = new Calculator();
		
		calculator.add (10, 5);
		calculator.difference( 10, 5);
		calculator.mulTwo(10, 5);
	    calculator.division(10, 7);
	}			
}


class Example1{
	
	int i=2;  
	int j= 10; 
	
	void display(){
		i= 10;   
		int i= 3;
		System.out.println("display method " + i);
	}
	
	public static void main (String [] a){
		Example1 example1 = new Example1();
		example1.display();
	}
}