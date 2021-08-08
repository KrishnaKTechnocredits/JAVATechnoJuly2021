package mayur;

class Calculator3{
	int num1 = 10;
	int num2 = 5;
	
	void add(){
		int total = num1 + num2;
		System.out.println("Sum of 2 numbers is " + total);
		System.out.println(num1+","+num2+"="+total);// 10,5=15
	}
	void sub(){
		int total = num1 - num2;
		System.out.println("Sum of 2 numbers is " + total);
		System.out.println(num1+","+num2+"="+total);// 10,5=15
	}
	void div(){
		int total = num1 * num2;
		System.out.println("Sum of 2 numbers is " + total);
		System.out.println(num1+","+num2+"="+total);// 10,5=15
	}
	void mul(){
		int total = num1 / num2;
		System.out.println("Sum of 2 numbers is " + total);
		System.out.println(num1+","+num2+"="+total);// 10,5=15
	}
	
	public static void main(String[] args){
		Calculator3 calculator = new Calculator3();
		calculator.add();
		calculator.sub();
		calculator.div();
		calculator.mul();
	}
}