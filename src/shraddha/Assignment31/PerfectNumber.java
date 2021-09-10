/*Program 1: verify given number is a perfect number or not.
input : 6
output : 6 is a perfect number
*/

package shraddha.Assignment31;

public class PerfectNumber {
	public static void main(String[] args) {
		PerfectNumber newObject = new PerfectNumber();
		int number = 24;
		if (newObject.checkForPerfectNumber(number))
			System.out.println("Number " + number + " is a Perfect number");
		else
			System.out.println("Number " + number + " is NOT a Perfect number");
	}

	boolean checkForPerfectNumber(int number) {
		int sum = 0;
		for (int index = 1; index <= number/2; index++) {
			if (number % index == 0)
				sum += index;
		}
		System.out.println(sum);
		if (sum == number)
			return true;
		else
			return false;
	}
}
