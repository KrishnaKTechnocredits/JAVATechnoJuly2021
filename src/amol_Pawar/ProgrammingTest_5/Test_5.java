package amol_Pawar.ProgrammingTest_5;

public class Test_5 {

	int count = 0;

	void getPerfectNum(long input) {

		long temp = input / 2;
		long sum = 0;
		while (temp != 0) {
			if (input % temp == 0) {
				sum = sum + temp;
			}
			temp--;
		}
		if (input == sum) {

			System.out.println(input);
			count++;
		}
	}

	void getFiveperfectNum() {

		long num = 1;
		while (count < 5) {
			getPerfectNum(num);
			num++;
		}
	}

	public static void main(String[] args) {

		Test_5 test_5 = new Test_5();
		test_5.getFiveperfectNum();
	}

}
/*
 * Test 5 : Find first 5 perfect numbers.
 */
