package akanksha_Jain.Assignment_30;

public class Program_5_PerfectSquare {
	
	int isPerfectSquare(int number) {
		int pSquareNumber=0;
		for (int index=1; index<number; index++) {
			if(number%index == 0) {
				pSquareNumber = index;
			}
		}
		return pSquareNumber;
	}
	
	void displayPerfectSquareResult(int number) {
		int perfSNo = isPerfectSquare(number);
		if(perfSNo * perfSNo == number)
			System.out.println(number + " is a perfect square");
		else
			System.out.println(number + " is not a perfect square");
	}

	public static void main(String[] args) {
		int number = 25; // 5 * 5 = 25 equal to number
		int number2 = 30; // 15 * 15 = 225 not equal to number2
		Program_5_PerfectSquare perfSquare = new Program_5_PerfectSquare();
		perfSquare.displayPerfectSquareResult(number);
		perfSquare.displayPerfectSquareResult(number2);
	}
}