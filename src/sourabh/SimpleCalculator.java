// Simple Calculator

package sourabh;

class SimpleCalculator{
	int x = 50;
	int y = 30;
	
	void add(){
		int SUM = x + y;
		System.out.println("Addition of 2 no's = "+ SUM);
	}
	
	void sub(){
		int SUB = x - y;
		System.out.println("Subtraction of 2 no's = "+ SUB);
	}
	
	void mul(){
		int MUL = x * y;
		System.out.println("Multiplication of 2 no's = "+ MUL);
	}
	
	void div(){
		int DIV = x / y;
		System.out.println("Division of 2 no's = "+ DIV);
	}
	
	public static void main(String[] args){
		SimpleCalculator s_calculator = new SimpleCalculator();
		s_calculator.add();
		s_calculator.sub();
		s_calculator.mul();
		s_calculator.div();
	}

}