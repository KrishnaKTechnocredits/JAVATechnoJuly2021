package prerana;

public class Assignment2 {


		  void add(int num1,int num2){
		  int sum =num1+num2;
		   System.out.println("sum of numbers are:" +sum);
		  }
		  
		  
		  void sub(int num1,int num2){
		  int sub=num1-num2;
		  System.out.println("subtractions of numbers are:" +sub);
		  }
		   
		   void mul(int num1,int num2){
		   int mul=num1*num2;
		   System.out.println("multiplication of numbers are:" +mul);
		  }
		  
		   void div(int num1,int num2)
		   {
			   int div=num1/num2;
			  System.out.println("division of numbers are:" +div);
		  }
		  public static void main(String[] args)
		  {
		   Assignment2 c=new Assignment2();
		   c.add(10,30);
		   c.sub(50,30);
		   c.mul(9,20);
		   c.div(100,30);
		   c.div(100,30);
		   }
}


