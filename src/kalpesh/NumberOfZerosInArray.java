package kalpesh;

public class NumberOfZerosInArray {
	int getCountZeroNumbers(int[] num) {
		int count = 0;
		for (int index = 0; index < num.length; index++) {
			if (num[index] == 0) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		NumberOfZerosInArray numberofzerosinarray = new NumberOfZerosInArray();
		int[] input = { 1, -11, 0, 0, 55, 0, -23, 0 };
		System.out.println("Number of zero's in given array: " + numberofzerosinarray.getCountZeroNumbers(input));
	}

}
