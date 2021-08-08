package sushant;


class Calculator1{
	
	void add(int x , int y){
		int answer = x + y;
		System.out.println("Addition of two variables: "+answer);
	}
	
	void sub(int x , int y){
		int answer = x - y;
		System.out.println("Substration of two variables: "+answer);
	}
	
	void mul(int x , int y){
		int answer = x * y;
		System.out.println("Multiplication of two variables: "+answer);
	}
	
	void div(int x , int y){
		int answer = x / y;
		System.out.println("Division of two variables: "+answer);
	}
	
	public static void main(String[] args){
		Calculator1 calculator1 = new Calculator1();
		calculator1.add(20 , 10);
		calculator1.sub(20 , 5);
		calculator1.mul(10 , 5);
		calculator1.div(10 , 5);	
	}
}