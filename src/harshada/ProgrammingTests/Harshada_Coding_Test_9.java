/*Test - 9 : 21st Nov'2021
find closest negative number with respect to 8 
int[] arr = {-3,11,123,-11,-9,-55,33,44};
output : -3

PR #101 -> time : 15 mins

Branch name - Varun_coding_test_9

*/
package harshada.ProgrammingTests;

public class Harshada_Coding_Test_9 {

	void getClosestNumberToZero() {
		int[] arr = { -3, 11, 123, -11, -9, -55, 33, -11 };
		int closestValue = arr[0];

		for (int index = 0; index < arr.length; index++) {

			if (arr[index] < 0) {
				if (arr[index] > closestValue) {
					closestValue = arr[index];
				}
			}
		}
		System.out.println("Closest Value= " + closestValue);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Harshada_Coding_Test_9 coding_Test_9 = new Harshada_Coding_Test_9();
		coding_Test_9.getClosestNumberToZero();

	}

}
