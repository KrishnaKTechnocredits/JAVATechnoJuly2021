package pritiProgrammesOnNumbers;

public class Assingment_31_2 {
	
	boolean isPerfectSquare(int num) {
		int square = (int)Math.sqrt(num);
		int sum = square*square;
		if (sum==num)
			return true;
		else 
			return false;
	}
	
	void displayResult(int num) {
		if (isPerfectSquare(num)) 
			System.out.println(num +":is perfect square");
		else
			System.out.println(num +":is not perfect square");
			
	}
	
	public static void main(String[] a) {
		Assingment_31_2 assingment_31_2 = new Assingment_31_2();
		int num= 25;
		assingment_31_2.displayResult(num);
		int num1= 20;
		assingment_31_2.displayResult(num1);
	}

}
/*Program 2 : verify given number is a perfect square.
input : 25 
output : 25 is perfect square.49

input : 20
output : 20 is not a perfect square*/