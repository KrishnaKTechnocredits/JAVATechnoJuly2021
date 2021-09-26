/*Test 5 :
Find first 5 perfect numbers.
*/

package vivek.ScodingTest;

public class CodingTest5 {

	int perfectNoCnt;

	void isPerfectNumber(int num) {
		int sum = 1;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0)
				sum += index;
		}
		if (sum == num) {
			System.out.println(num);
			perfectNoCnt++;
		}
	}

	void first5PerfectNumbers() {
		int index = 2;
		System.out.println("First 5 perfect numbers are");
		while (perfectNoCnt < 5) {
			isPerfectNumber(index);
			index++;
		}
	}

	public static void main(String[] args) {
		CodingTest5 codingtest5 = new CodingTest5();
		codingtest5.first5PerfectNumbers();
	}
}
