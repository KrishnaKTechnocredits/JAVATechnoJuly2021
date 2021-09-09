package akanksha_Jain.Assignment_31;

public class Program_1_PerfectNumber {
	
	int isPerfectNumber(int number) {
		int pNumber=0;
		for (int index=1; index<number; index++) {
			if(number%index == 0) {
				pNumber = pNumber + index;
			}
		}
		return pNumber;
	}
	
	void displayPerfectNumberResult(int number) {
		if(isPerfectNumber(number)==number)
			System.out.println(number + " is a perfect number");
		else
			System.out.println(number + " is not a perfect number");
	}

	public static void main(String[] args) {
		Program_1_PerfectNumber perfNumber = new Program_1_PerfectNumber();
		perfNumber.displayPerfectNumberResult(6);
		perfNumber.displayPerfectNumberResult(50);
	}
}
