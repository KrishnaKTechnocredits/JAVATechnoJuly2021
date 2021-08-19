/*  program 1 : return count of positive numbers from given array.
int[] input = {1,-11,-44,23,55,-99,-23,-22};
output : 3
 */

package arti_K.Assignment_13;

public class CountOfPositiveNum {

	int countPositiveNum(int[] arr) {
		int count = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > 0)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {

		int[] input = { 1, -11, -44, 23, 55, -99, -23, -22 };
		CountOfPositiveNum countofpositivenum = new CountOfPositiveNum();
		int count = countofpositivenum.countPositiveNum(input);
		System.out.println("Count of positive numbers from given array is : " + count);
	}
}
