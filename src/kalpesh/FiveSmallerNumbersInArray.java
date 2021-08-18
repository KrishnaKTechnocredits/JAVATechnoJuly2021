package kalpesh;

public class FiveSmallerNumbersInArray {
	int[] getArrayofFiveNumbers(int num) {

		int count = 0;
		int[] input = new int[5];
		for (int index = num; index > num - 5; index--) {
			if (count != 5) {
				input[count] = index - 1;
				System.out.println(input[count]);
				count++;
			}
		}
		return input;
	}

	public static void main(String[] args) {
		FiveSmallerNumbersInArray fivesmallernumbersinarray = new FiveSmallerNumbersInArray();
		fivesmallernumbersinarray.getArrayofFiveNumbers(50);

	}
}
