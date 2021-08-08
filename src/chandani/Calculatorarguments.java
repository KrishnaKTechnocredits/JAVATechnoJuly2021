package chandani;

class Calculatorarguments{

  int num1 = 40;
  int num2 = 20;
  
  void add(int num1, int num2){
	int sum = num1 + num2;
	System.out.println("Sum of 2 numbers is "+sum);
  }
  
  void subtract(int num1, int num2){
	int sub = num1 - num2;
	System.out.println("Subtration of 2 numbers is "+sub);
  }
  
  void multiply(int num1, int num2){
	int mult = num1 * num2;
	System.out.println("Multiplication of 2 numbers is "+mult);
  }
  
  void division(int num1, int num2){
	int divide = num1/num2;
	System.out.println("Division of 2 numbers is "+divide);
  }
	
  
  public static void main (String[] args){
	  Calculatorarguments Calculatorarguments = new Calculatorarguments();
	Calculatorarguments.add(20,20);
	Calculatorarguments.subtract(30,20);
	Calculatorarguments.multiply(10,100);
	Calculatorarguments.division(100,10);
  }
}