
//Assignment11-Whileloop

package somnath;
public class Assignment11 {
	void findPrimeNumber(int primeCount, int number) {
		int count = 0;
		System.out.println("First " + primeCount + " prime numbers starting from number " + number + " are:");
		while (count < primeCount) {
			if (number != 0 && number != 1) {
				if (verifyPrimeNumber(number)) {
					System.out.println(number);
					count++;
				}
			}
			number++;
		}
	}

	Boolean verifyPrimeNumber(int number) {
		Boolean status = true;
		for (int index = 2; index <= number / 2; index++) {
			if (number % index == 0) {
				status = false;
				break;
			}
		}
		if (status)
			return status;
		else
			return false; 

	}

	void findNumbersToGetRequiredSum(int reqSum, int startIndex) {
		System.out.println("\r\nFor index starting with number " + startIndex
				+ ", count of numbers required to generate sum more than " + reqSum + " is:");		
		
		int sum = 0;
		int count = 0;
		while (sum <= reqSum) {
			sum = sum + startIndex;
			count++;
			startIndex++;
		}
		System.out.print(count);

	}

	public static void main(String[] args) {
		Assignment11 assignment11 = new Assignment11();
		assignment11.findPrimeNumber(15,0);
		assignment11.findNumbersToGetRequiredSum(100,1);
	}

}
 