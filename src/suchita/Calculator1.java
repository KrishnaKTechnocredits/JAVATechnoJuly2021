package suchita;
class Calculator1{
	
	void add(int num1,int num2){
				int sum = num1+num2;
				System.out.println("Addition of two variables= " + sum);
			}

	void sub(int num1,int num2)
	{
				int output =num1-num2;
				System.out.println("Substration of two numbers= " + output);
	}	

	void mul(int num1, int num2){
				int output = num1*num2;
				System.out.println("Multiplication of two numbers= " + output);
	}	
	
	void div(int num1 ,int num2){
				int output = num1/num2;
				System.out.println("Division of two numbers= " + output);
	}
	
	public static void main(String[] args)
	{
			Calculator1 calculator1 = new Calculator1();
			calculator1.add(30,40);
			calculator1.sub(60,20);
			calculator1.mul(20,30);
			calculator1.div(90,3);
			
	}
}

