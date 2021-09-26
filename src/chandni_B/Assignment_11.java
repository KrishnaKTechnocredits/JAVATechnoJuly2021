package chandni_B;

public class Assignment_11 {

	boolean isPrimeNumber(int num) {
			boolean flag = true;
		for (int index = 2; index < num; index++) {
			if (num % index == 0) {
				flag = false;
				break;
			}
		} return flag;
		
	}
	
	void getFirstNPrimeNumbers (int N) {
		System.out.print("First" + N + " prime numbers are ");
		int number = 2;
		int primeCount = 0;
		while (primeCount < N) {
			if (isPrimeNumber(number)) {
				System.out.print(number + ",");
				primeCount++;
			}
			number++;
		}
	}
	
	void findRequiredNumbersForSumOfN (int N) {
		int num = 1;
		int sum = 0;
		while (sum < N) {
			sum = num + sum;
			num++;
			}
		System.out.println ("Total numbers required for sum of " + N + " is " + num);
	}
		
		
		
	public static void main(String[] args) {
		Assignment_11 assignment_11 = new Assignment_11 ();
		assignment_11.getFirstNPrimeNumbers(10);
		System.out.println (' ');
		assignment_11.findRequiredNumbersForSumOfN(100);
	}
	}
	
	