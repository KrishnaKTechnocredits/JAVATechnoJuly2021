package himanshu_array_assignment;

public class Consecutive_Numbers_Triplet {

	void getConsecutiveNumbersTriplet(int[] arr) {
		for (int index = 0; index < arr.length - 2; index++) {
			if (arr[index] + 1 == arr[index + 1] && arr[index] + 2 == arr[index + 2]) {
				System.out.println(arr[index] + ", " + arr[index + 1] + ", " + arr[index + 2]);
			}
		}
	}

	public static void main(String[] args) {

		int[] inputarray = { 10, 23, 24, 25, 26, 61, 62, 64, 65, 66 };

		Consecutive_Numbers_Triplet assignment31_3 = new Consecutive_Numbers_Triplet();
		assignment31_3.getConsecutiveNumbersTriplet(inputarray);
	}
}
