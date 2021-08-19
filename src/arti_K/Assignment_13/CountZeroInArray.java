/*	program 2 : count number of zero's in given array.
int[] input = {1,-11,0,0,55,0,-23,0};
output : 4
*/

package arti_K.Assignment_13;

public class CountZeroInArray {

	int countNumOfZero(int[] arr) {
		int count = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] == 0)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		int[] input = { 1, -11, 0, 0, 55, 0, -23, 0 };
		CountZeroInArray countzeroinarray = new CountZeroInArray();
		System.out.println("Count of Zero's in given Array : " + countzeroinarray.countNumOfZero(input));
	}
}
