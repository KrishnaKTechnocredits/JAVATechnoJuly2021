package akanksha_Jain.Assignment_30;

public class Program_4_PerfectNumber {
	
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
			System.out.println(number + " is perfect number.");
		else
			System.out.println(number + " is not a perfect number.");
	}

	public static void main(String[] args) {
		int number = 6;
		Program_4_PerfectNumber perfNumber = new Program_4_PerfectNumber();
		perfNumber.displayPerfectNumberResult(number);
	}
}