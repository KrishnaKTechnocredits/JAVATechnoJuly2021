package madhavi;

public class Coding_Test_7 {
	int increasingTripletCount(int[] arr) {
		int count = 0, index1, index2, index3;

		for (int i = 0; i < arr.length - 2; i++) {
			index1 = arr[i];
			index2 = arr[i + 1];
			index3 = arr[i + 2];
			if (index1 < index2 && index2 < index3) {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		Coding_Test_7 coding_Test_7 = new Coding_Test_7();
		int[] input = { 10, 9, 11, 6, 23, 25, 22, 66, 34 };
		System.out.println(coding_Test_7.increasingTripletCount(input));

	}
}