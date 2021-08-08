package priti;
class Calculator {
	
	void add (int num1, int num2){
	int sum = num1+num2;
	System.out.println("Addition of two numbers is "+ sum);
	}
	
	void sub (int num1, int num2){
	int sub = num1-num2;
	System.out.println("Substraction of two numbers is "+ sub);
	}
	
	void mul (int num1, int num2){
	int mul = num1*num2;
	System.out.println("Multiplication of two numbers is "+ mul);
	}
	
	void div (int num1, int num2){
	int div = num1/num2;
	System.out.println("Division of two numbers is "+ div);
	}
		
	public static void main(String[] a){
		Calculator cal_1 = new Calculator();
		cal_1.add (10, 20);
		cal_1.sub (30, 10);
		cal_1.mul (10, 5);
		cal_1.div (20, 5);
			
		}
}