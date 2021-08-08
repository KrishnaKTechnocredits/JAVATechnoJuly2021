package kalpesh;

class Calculator{
   int x= 20;
   int y= 5;
   
   void add(){
	   int addAns = x + y;
	   System.out.println("Addition of two variable is "+addAns);
   }
   
   void sub(){
	   int subAns = x - y;
	   System.out.println("Subtraction of two variable is "+subAns);
   }
   
	void mul(){
	   int mulAns = x * y;
	   System.out.println("Multiplication of two variable is "+mulAns);
   }   
   
   void div(){
	   int divAns = x / y;
	   System.out.println("Division of two variable is "+divAns);
   }
   
   public static void main(String[] args){
	 Calculator calculator1 = new Calculator();
	 calculator1.add();
	 calculator1.sub();
	 calculator1.mul();
	 calculator1.div();
  }
}