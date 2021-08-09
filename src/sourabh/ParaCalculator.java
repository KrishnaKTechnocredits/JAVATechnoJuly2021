// Calculator by passing parameters values

package sourabh;

class ParaCalculator{
	int x;
	int y;
	
	void add(int x, int y){
		int SUM = x + y;
		System.out.println("Addition of 2 no's = "+ SUM);
	}
	
	void sub(int x, int y){
		int SUB = x - y;
		System.out.println("Subtraction of 2 no's = "+ SUB);
	}
	
	void mul(int x, int y){
		int MUL = x * y;
		System.out.println("Multiplication of 2 no's = "+ MUL);
	}
	
	void div(int x, int y){
		int DIV = x / y;
		System.out.println("Division of 2 no's = "+ DIV);
	}
	
	public static void main(String[] args){
		ParaCalculator p_calculator = new ParaCalculator();
		p_calculator.add(10,20);  //30
		p_calculator.sub(100,45); //55
		p_calculator.mul(100,500); //50000;
		p_calculator.div(30,6);    //5;
	}
}