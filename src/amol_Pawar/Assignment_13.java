package amol_Pawar;

public class Assignment_13 {

	int[] getPositiveArray(int[] arr) {
		int count = 0;
		int arr1[] = new int[arr.length];

		for (int index = 0; index < arr.length; index++) {
			if (arr[index] >= 0) {
				arr1[count] = arr[index];
				count++;
			}
		}
		return arr1;
	}

	void displayPositiveArray(int[] positiveNum) {
		for (int index = 0; index < positiveNum.length; index++) {
			if (positiveNum[index] > 0)
				System.out.println(positiveNum[index] + " is positive numbers in array");
		}
	}

	void getToatlZeroInArray(int[] arr) {
		int count = 0;
		for (int index = 0; index < arr.length; index++) {

			if (arr[index] == 0)
				count++;
		}
		System.out.println("Total zero in array are: " + count);
	}

	void getSmallerNumberOfArray(int num) {
		int[] arr = new int[5];
		for (int index = 0; index < 5; index++) {
			num--;
			arr[index] = num;
			System.out.print(arr[index] + " ");
		}
	}

	public static void main(String[] args) {

		Assignment_13 assignment_13 = new Assignment_13();
		int[] input = { 1, -11, -44, 23, 55, -99, -23, -22 };
		int[] positiveNum = assignment_13.getPositiveArray(input);
		assignment_13.displayPositiveArray(positiveNum);
		System.out.println("######Progame to Find Total Zero in an array######");
		int[] arr = { 1, -11, 0, 0, 55, 0, -23, 0 };
		assignment_13.getToatlZeroInArray(arr);
		System.out.println("######Samller five array in prgramme is below######");
		assignment_13.getSmallerNumberOfArray(50);
	}
}
