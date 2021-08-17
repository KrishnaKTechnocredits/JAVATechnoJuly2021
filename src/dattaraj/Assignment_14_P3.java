package dattaraj;

public class Assignment_14_P3 {
	
	int getMaxMinNumberDiff(int[] num) {
		int min = num[0];
		int max = num[0];
		for (int index = 0; index < num.length; index++) {
			if (num[index] < min)
				min = num[index];
			if (num[index] > max)
				max = num[index];

		}
		return max - min;
	}
	public static void main(String[] args) {
		int[] input = { 1, 11, 44, 23, 55, 99, 23 };
		Assignment_14_P3 arrayP3 = new Assignment_14_P3();
		System.out.println("Difference between maximum and minimum number from given array is "
				+ arrayP3.getMaxMinNumberDiff(input));
	}
}
