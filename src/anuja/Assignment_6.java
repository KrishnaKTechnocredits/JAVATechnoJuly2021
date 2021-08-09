package anuja;

class Assignment_6{

	float prin=5000;
	float rate=1;
	float time=2;
	float si;
	float F=99;
	float C;
	 
	void calculatesimpint(){
	
			si=(prin*rate*time)/100;
			System.out.println("Simple interest is "+si);

}	
	
	void tempconversion(){
	
		C=(F-32)*5/9;
		System.out.println("Celsius temperature is "+C);

}

	public static void main(String args[]){
		Assignment_6 assignment_6= new Assignment_6();
		assignment_6.calculatesimpint();
		assignment_6.tempconversion();
	
	
	}
	}