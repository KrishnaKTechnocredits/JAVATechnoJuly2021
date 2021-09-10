/*Test 5 :
	Find first 5 perfect numbers*/
package sayli_Vyavhare;

public class PerfectNum_Test5 {

	void getPerfectNum(int num) {
		int count = 0;
		int number = 1, sum;

		while (count < num) {
			sum = 0;
			for (int index = 1; index < number; index++) {
				if (number % index == 0)

					sum += index;
			}
			if (number == sum) {
				System.out.println(number);
				count++;

			}
			number++;
		}

	}

	public static void main(String[] args) {
		PerfectNum_Test5 perfectnum = new PerfectNum_Test5();
		System.out.println("Perfect numbers are:");
		perfectnum.getPerfectNum(5);
	}

}
