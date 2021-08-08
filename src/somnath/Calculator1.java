package somnath;
class Calculator1{
     int num1=30;
     int num2=15;
	 
	void add(){
		 int sum = num1+num2;
		 System.out.println(" sum of 2 no.is " + sum);
		 
	}
	 void sub(){
		 int sub = num1-num2;
		 System.out.println(" sub of 2 no.is " + sub);
		 
	}
	
	
	void mul(){
		 int mul = num1*num2;
		 System.out.println(" mul of 2 no.is " + mul);
		 
	}
	
	void div(){
		 int div = num1/num2;
		 System.out.println(" div  of 2 no.is " + div);
		 
	}
	 
	 public static void main(String[] args){
		 Calculator1 calculator1 = new Calculator1();
		 calculator1.add();
		 calculator1.sub();
		 calculator1.mul();
		 calculator1.div();
	 }
}	 

