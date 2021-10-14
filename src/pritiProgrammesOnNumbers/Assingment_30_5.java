package pritiProgrammesOnNumbers;

public class Assingment_30_5 {
	
	
	boolean isPerfesctSquare(int input) {
	int square = (int)Math.sqrt(input);
	int sum = square*square;
	if (sum==input)
		return true;
	else 
		return false;
	
	}
	void displayResult(int squareNum) {
		if (isPerfesctSquare(squareNum)) 
			System.out.println(squareNum +" :is perfect square");
		else
			System.out.println(squareNum +" :is not perfect square");		
		
		
	}
	
	public static void main(String[]a) {
		Assingment_30_5 displayResult = new Assingment_30_5();
		int num = 144;
		displayResult.displayResult(num);
		int num1 = 142;
		displayResult.displayResult(num1);
	}

}
/*(Optional) Program 5 : verify given number is a perfect square.*/