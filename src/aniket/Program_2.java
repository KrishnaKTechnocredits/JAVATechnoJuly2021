package aniket;

public class Program_2 {

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
		Program_2 program2 = new Program_2();
		int[] input = { 1, -11, 0, 0, 55, 0, -23, 0 };
		System.out.println("Number of zero's in given array: " + program2.getCountZeroNumbers(input));
	}

}