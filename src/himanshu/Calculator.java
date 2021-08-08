package himanshu;

class Calculator{
   
    int no1 = 20;
    int no2 = 10;
   
    void addition(){
     int sum = no1+no2;
     System.out.println(sum);
    }
   
    void subtraction(){
	   int sub = no1-no2;
	   System.out.println(sub);
    }
	
	void muliplication(){
		int mul = no1*no2;
		System.out.println(mul);
	}
	
	void division(){
		int div = no1/no2;
		System.out.println(div);
	}
	
    public static void main(String[]args){
      Calculator calculator = new Calculator();
      calculator.addition();
	  calculator.subtraction();
	  calculator.muliplication();
	  calculator.division();
   
    }
      
}