package tarang;


class Calculator{

   int num1 = 10;
   int num2 = 5;
   
     void addition(){
       int sum = num1 + num2;
	   System.out.println("Addition of 2 number is:" + sum);
     }
	 
	 void subtraction(){
       int sub =num1-num2;
	   System.out.println("Subtraction of 2 number is:" + sub);
     }
	 
	 void multiplication(){
       int mul =num1*num2;
	   System.out.println("Multiplication of 2 number is:" + mul);
     }
	 void division(){
       int div =num1/num2;
	   System.out.println("Division of 2 number is:" + div);
     }
	 
	 public static void main(String[] a){
		 
	   Calculator calculator = new Calculator();
       calculator.addition();
       calculator.subtraction();
       calculator.multiplication();
       calculator.division();	   
	 }
}
	 