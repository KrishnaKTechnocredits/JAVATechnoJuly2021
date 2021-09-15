package himanshu_array_assignment;

public class ShiftAllZeroFirst {

	void shiftZeroMtd(int[] arr) {

		int count = 0;
		int[] output = new int[arr.length];

		for (int index = 0; index < arr.length; index++) {
			if (arr[index] == 0) {
				count++;
			}
		}
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != 0) {
				output[count] = arr[index];
				count++;
			}
			System.out.print(output[index]);
		}

	}

	public static void main(String[] args) {

		int[] arr = { 1, 0, 0, 6, 0, 2, 3, 0, 4, 0, 5 };

		ShiftAllZeroFirst assignment33_1 = new ShiftAllZeroFirst();
		assignment33_1.shiftZeroMtd(arr);
	}
}
