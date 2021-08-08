// Assignment 1
package pranita;

class Calculator {
   
    void add(int num1,int num2){
    int sum= num1+num2;
    System.out.println("sum of 2 num is " +sum);
	}
	
	void sub(int num1,int num2){
    int sub= num1-num2;
    System.out.println("subtraction of 2 num is " +sub);
	}
	
	void mul(int num1,int num2){
    int mul= num1*num2;
    System.out.println("multiplication of 2 num is " +mul);
	}
	
	void div(int num1,int num2){
    int div= num1/num2;
    System.out.println("division of 2 num is " +div);
	}
	
	public static void main(String[] a){
	Calculator calculator= new Calculator();
	calculator.add(55,25);
	calculator.mul(10,20);
    calculator.sub(200,100);
	calculator.div(300,5);
	}
}	