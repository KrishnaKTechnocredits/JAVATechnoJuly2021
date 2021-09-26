/*Test 5 :
Find first 5 perfect numbers.*/

package shraddha.CodingTest;

public class First5PerfectNumbers {
	public static void main(String[] args) {
		First5PerfectNumbers newObject = new First5PerfectNumbers();
		int count = 0;
		int number = 2;
		System.out.println("First 5 Perfect Numbers are :- ");
		while (count <= 7) {
			if (newObject.checkForPerfectNumber(number)) {
				System.out.println(number);
				count++;
			}
			number++;
		}
	}

	boolean checkForPerfectNumber(int number) {
		int sum = 0;
		for (int index = 1; index <= number / 2; index++) {
			if (number % index == 0)
				sum += index;
		}
		if (sum == number)
			return true;
		else
			return false;
	}

}
