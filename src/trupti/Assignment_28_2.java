package trupti;

public class Assignment_28_2 {

	public static void main(String[] args) {
		Assignment_28_2 max = new Assignment_28_2();
		int[] arr = { 10, 23, 2, 11, 55, 43, 99 };
		max.nthMaxNumber(3, arr);
	}

	void nthMaxNumber(int number, int[] arr) {
		int highestIndex;
		int max = 0;
		int startNumber = 0;
		while (startNumber < number) {
			int index = 0;
			max = arr[index];
			highestIndex = 0;
			for (index = 1; index < arr.length; index++) {
				if (arr[index] > max) {
					max = arr[index];
					highestIndex = index;
				}
			}
			arr[highestIndex] = 0;
			startNumber++;
		}
		System.out.println("Third highest no: " + max);
	}
}
