package aniket;

public class Program_1 {

	int count = 0;

	int getCountPositiveNumber(int[] num) {
		for (int index = 0; index < num.length; index++) {
			if (num[index] > 0)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Program_1 program1 = new Program_1();
		int[] input = { 11,8,123,-20,-15,-75};
		System.out.println("Count of positive numbers in array: " + program1.getCountPositiveNumber(input));
	}

}