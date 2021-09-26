/*Test - 7 : 11th Sep
Program 1: Count the number of triplets in increasing order. [expected time : 10 mins]
input : 10,9,11,6,23,25,22,66,34
ouput : 1
hint : 6,23,25 */
package mayur.ProgrammingTest7;

public class CodingTest_7 {

	int countTripletsInIncOrder(int[] input) {
		int count = 0;
		int num;
		for (int index = 0; index < input.length - 2; index++) {
			num = input[index];
			if (num < input[index + 1]) {
				if (input[index + 1] < input[index + 2]) {
					count++;

				}
			}
		}
		return count;

	}

	public static void main(String[] args) {

		CodingTest_7 codingTest_7 = new CodingTest_7();
		int[] arr = { 10, 9, 11, 6, 23, 25, 22, 66, 34 };
		System.out.println("Number of triplets in increasing order is : " + codingTest_7.countTripletsInIncOrder(arr));
	}

}
