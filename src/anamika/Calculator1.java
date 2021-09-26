package anamika;

class Calculator1{
	
	void add(int num1,int num2){
		int sum = num1 + num2;
		System.out.println("sum of 2 numbers is "+sum);
		
	}
	
	void sub(int num1,int num2 ){
		int sub = num1 - num2;
		System.out.println("subtraction of 2 numbers is "+sub);
		
	} 
	
	void mul(int num1,int num2){
		int mul = num1 * num2;
		System.out.println("multiplication of 2 numbers is "+mul);
		
	}
	
	void div(int num1,int num2){
		int div = num1 / num2;
		System.out.println("division of  2 numbers  is "+div);
	}
	
	public static void main(String[] a){
		Calculator1 calculator1 = new Calculator1();
		calculator1.add(10,10);
		calculator1.sub(4,5);
		calculator1.mul(5,3);
		calculator1.div(45,9);
	}

}