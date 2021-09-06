package himanshu_array_assignment;

public class NthMaxNo {

	int nthMaxNo = 0;

	void getSecondHighestNumber(int[] arr) {

		int count = 0;
		int maxNo = 0;
		int secondMaxNo = 0;

		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > maxNo) {
				maxNo = arr[index];
				count = index;
			}
		}
		arr[count] = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > secondMaxNo)
				secondMaxNo = arr[index];
		}
		nthMaxNo = secondMaxNo;
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
			System.out.println("Nth highest number from array : " + nthMaxNo);
		}
	}

	public static void main(String[] args) {

		int[] arr = { 10, 23, 2, 11, 55, 43, 99 };

		NthMaxNo nthMax = new NthMaxNo();
		nthMax.getNthHighestNumber(arr, 3);
	}
}
