
// Simple Calculator Program
 package santosh;
class Calculator1 {

    void add(int num1,int num2){
	
	    int sum = num1+num2;
	    
		System.out.println("Addition of two intger value is : == " +sum);
	 
	}
	
	 void sub(int num1,int num2){
	
	    int sub = num1-num2;
	    
		System.out.println("Substraction of two intger value is : == " +sub);
	 
	}
	
	 void mul(int num1,int num2){
	
	    int mul = num1*num2;
	    
		System.out.println("Multiplication of two intger value is : == " +mul);
	 
	}
	
	 void div(int num1,int num2){
	
	    int div = num1/num2;
	    
		System.out.println("Division of two intger value is : == " +div);
	 
	}
	
	
	public static void main(String[] args){
		
	 Calculator1 calculator1_1 = new Calculator1();
	 
	      calculator1_1.add(10,20);
		  calculator1_1.sub(20,10);
		  calculator1_1.mul(2,20);
		  calculator1_1.div(10,2);
		  
	}	  
	 
}	 