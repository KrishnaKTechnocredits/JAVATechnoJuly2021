package neha;

import java.util.Arrays;

/*Test 5 :
Find first 5 perfect numbers.
Solution: Using first 5 prime numbers
Formula: Perfect Number= 2^(p-1)*((2^p)-1)
*/
public class PerfectNumTest5 {
	Boolean primeNumber(int num) {
		Boolean status = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				status = false;
				break;
			}
		}
		return status;
	}

	long[] perfectNumbers() {
		long[] perfectNumArr = new long[5];
		int count = 0;
		int num = 2;

		while (count < 5) {
			if (primeNumber(num) && num != 11) {
				perfectNumArr[count] = ((long) (Math.pow(2, num - 1)) * ((long) (Math.pow(2, num) - 1)));
				count++;
			}
			num++;
		}
		return perfectNumArr;
	}

	public static void main(String[] args) {
		PerfectNumTest5 perfectNumTest5 = new PerfectNumTest5();
		System.out.println("First 5 perfect numbers are: " + Arrays.toString(perfectNumTest5.perfectNumbers()));
	}
}
