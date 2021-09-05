package mratunjay.Assignment_1_To_5;

class Assignment_1{
	
	
	void addition(int num1,int num2){
		int sum = num1 + num2;
		System.out.println("Sum of two numbers is: "+sum);
	}
	 
	void substraction(int num1,int num2){
		int sub = num1 - num2;
		System.out.println("Subtraction of two numbers is "+sub);
	}
	
	void multiplication(int num1,int num2){
		int multiplicationti = num1*num2;
		System.out.println("multiplication of two numbers is "+multiplicationti);
	}
	
	void division(int num1,int num2){
		int divisions = num1/num2;
		System.out.println("division of two numbers is "+divisions);
	}
	
	public static void main(String[] args){
		Assignment_1 A_1 = new Assignment_1();
		A_1.addition(10,20); 
		A_1.addition(20,5);
		A_1.substraction(25,5); 
		A_1.substraction(30,15);
		A_1.multiplication(20,10); 
		A_1.multiplication(15,10);
		A_1.division(200,20); 
		A_1.division(15,5);
	}

}
