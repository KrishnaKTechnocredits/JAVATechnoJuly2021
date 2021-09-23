/*Program 1 : shift all non zeros at the end.
input : {1,0,3,4,0,2,88,0,0,22,34};
output : [0,0,0,0,1,3,4,2,88,22,34]
*/
package varun.varun_different_programs;

public class ShiftAllNonZeroAtEnd {
	int count = 0;

	void shiftNonZeroAtEnd(int[] arr) {
		int[] input = new int[arr.length];
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] == 0)
				count++;
		}
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != 0) {
				input[count] = arr[index];
				count++;
			}
		}
		System.out.print("Shifting all non zero at end ");
		for (int index = 0; index < input.length; index++) {
			System.out.print(input[index] + ",");
		}
	}

	public static void main(String[] args) {
		int[] input = { 1, 0, 3, 4, 0, 2, 88, 0, 0, 22, 34 };
		ShiftAllNonZeroAtEnd sc = new ShiftAllNonZeroAtEnd();
		sc.shiftNonZeroAtEnd(input);
	}
}
