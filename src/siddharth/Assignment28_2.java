package siddharth;

public class Assignment28_2 {
	int nthMaxNo = 0;

	void getSecondHighestNumber(int[] arr) {
		int maxNo = 0;
		int cnt = 0;
		int secondMax = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > maxNo) {
				maxNo = arr[index];
				cnt = index;
			}
		}
		arr[cnt] = 0;
		for (int index1 = 0; index1 < arr.length; index1++) {
			if (arr[index1] > secondMax)
				secondMax = arr[index1];
		}
		nthMaxNo = secondMax;
	}

	void getNthHighestNumber(int[] arr, int number) {

		if (number == 1) {
			for (int index = 0; index < arr.length; index++) {
				if (arr[index] > nthMaxNo) {
					nthMaxNo = arr[index];
				}
			}
			System.out.println(nthMaxNo);
		} else {
			for (int index = 2; index <= number; index++) {
				getSecondHighestNumber(arr);
			}
			System.out.println(nthMaxNo);
		}
	}

	public static void main(String[] args) {
		Assignment28_2 assignment28_2 = new Assignment28_2();
		int[] arr = { 10, 23, 2, 11, 55, 43, 99 };
		assignment28_2.getNthHighestNumber(arr, 3);
	}
}
