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
		int number = 9;
		Program_5_PerfectSquare perfSquare = new Program_5_PerfectSquare();
		perfSquare.displayPerfectSquareResult(number);
	}
}