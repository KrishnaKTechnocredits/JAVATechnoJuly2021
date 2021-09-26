package monali.Assignment_31;

public class PerfectNumbers {

	private boolean isPerfectNumber(int number) {
		int input = number;
		int sum = 0;
		for (int index = 1; index < number; index++) {
			if (number % index == 0)
				sum += index;
		}
		if (sum == input)
			return true;
		else
			return false;
	}

	void displayPerfectNum(int input) {
		if (isPerfectNumber(input))
			System.out.println("Given number is perfect number");
		else
			System.out.println("Not a perfect number");
	}

	void getPerfectNumberInRange(int startIndex, int endIndex) {
		System.out.println("Perfect Numbers between given range : "+startIndex + " to "+endIndex);
		for (int index = startIndex; index < endIndex; index++) {
			if (isPerfectNumber(index)) {
				System.out.println(index + " ");
			}
		}
	}

	void getPerfectSquare(double num) {
		double number = Math.sqrt(num);
		if (num == (number * number)) {
			System.out.println("Number is perfect square " + num);
		} else
			System.out.println("Not a perfect square " + num);
	}

	public static void main(String[] args) {
		PerfectNumbers pefectNumbers = new PerfectNumbers();
		pefectNumbers.getPerfectSquare(20);
		pefectNumbers.getPerfectSquare(25);
		pefectNumbers.getPerfectNumberInRange(1, 170);
	

	}

}
