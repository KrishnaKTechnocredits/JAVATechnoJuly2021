package shantanu.numberManipulation_assignment30;

public class PerfectSquareProgram {
	boolean isPerfectSquare(int num) {
		boolean flag = false;
		for(int divisor = 1; divisor < num/2; divisor++) {
			if(divisor*divisor == num)
				flag = true;
		}
		return flag;
	}
	void displayResult(int num) {
		if(isPerfectSquare(num))
			System.out.println(num+" is perfect square!");
		else
			System.out.println(num+" is not perfect square!");
	}
	public static void main(String[] args) {
		PerfectSquareProgram perfectSquareProgram = new PerfectSquareProgram();
		perfectSquareProgram.displayResult(25);
	}
}
