/*program 1 : return count of positive numbers from given array.
int[] input = {1,-11,-44,23,55,-99,-23,-22};
output : 3*/

package varun.varun_array_assignment;

public class Assignment_13 {
	int count = 0;

	void positiveNumber(int[] arr) {
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > 0)
				count++;
		}
		System.out.println("Count of positive number form the given array is " + count);
	}

	public static void main(String[] args) {
		int[] arr = { 1, -11, -44, 23, 55, -99, -23, -22 };
		Assignment_13 assignment_13 = new Assignment_13();
		assignment_13.positiveNumber(arr);
	}

}