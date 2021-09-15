package shantanu.numberManipulation_assignment30;

public class PerfectNumberProgram {
	boolean isNumberPerfect(int num) {
		int perfect = 0;
		for(int divisor = 1; divisor <= num/2; divisor++) {
			if(num%divisor == 0)
				perfect += divisor;
		}
		if(perfect == num)
			return true;
		else
			return false;
	}
	void displayResult(int num) {
		if(isNumberPerfect(num))
			System.out.println(num + " is a perfect number!");
		else
			System.out.println(num + " is not a perfect number!");
	}
	public static void main(String[] args) {
		PerfectNumberProgram perfectNumberProgram = new PerfectNumberProgram();
		perfectNumberProgram.displayResult(28);
	}
}
