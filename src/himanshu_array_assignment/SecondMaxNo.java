package himanshu_array_assignment;

public class SecondMaxNo {

	void secondHighestArrayMtd(int[] arr) {

		int maxNo = 0;
		int secondMaxNo = 0;

		if (arr[0] > arr[1])
			maxNo = arr[0];
		else
			maxNo = arr[1];

		for (int index = 2; index < arr.length; index++) {
			if (arr[index] > maxNo) {
				secondMaxNo = maxNo;
				maxNo = arr[index];
			} else if (secondMaxNo > arr[index]) {
				secondMaxNo = arr[index];
			}
		}
		System.out.println("second highest number from array : " + secondMaxNo);
	}

	public static void main(String[] args) {

		int[] arr = { 10, 23, 2, 11, 55, 43, 99 };

		SecondMaxNo second = new SecondMaxNo();
		second.secondHighestArrayMtd(arr);
	}

}
