package ramkrishna;

class Calculator{
	
	void add(int x,int y){
		int z= x+y;
		System.out.println("Addition is : "+z);
	}

	void sub(int x, int y){
		int z=x-y;
		System.out.println("Subtraction is :"+z);
	}

	void mul(int x, int y){
		int z=x*y;
		System.out.println("Multifiaction  is "+z);
	}	

	void div(int x,int y){
		int z=x/y;
		System.out.println("Division is "+z);
	}

    public static void main(String[] args){
		Calculator calculator = new Calculator();
		calculator.add(10,5);
		calculator.sub(50,5);
		calculator.mul(100,5);
		calculator.div(75,4);
	}

}