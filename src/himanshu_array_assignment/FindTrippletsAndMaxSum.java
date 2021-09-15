package himanshu_array_assignment;

public class FindTrippletsAndMaxSum {

	void getTripplets(int[] arr) {

		int sum = 0;
		int sumMax = 0;
		int maxArrayindex = 0;

		for (int index = 0; index < arr.length - 2; index++) {
			if (arr[index] + 1 == arr[index + 1] && arr[index] + 2 == arr[index + 2]) {
				sum = arr[index] + arr[index + 1] + arr[index + 2];
			}
			if (sum > sumMax) {
				sumMax = sum;
				maxArrayindex = index;
			}
		}
		System.out.println(arr[maxArrayindex] + " " + arr[maxArrayindex + 1] + " " + arr[maxArrayindex + 2]
				+ " is a Tripplet and Having the Maximum Sum");
	}

	public static void main(String[] args) {

		int[] arr = { 10, 64, 65, 66, 23, 24, 25, 26, 61, 62 };

		FindTrippletsAndMaxSum assignment32 = new FindTrippletsAndMaxSum();
		assignment32.getTripplets(arr);
	}

}