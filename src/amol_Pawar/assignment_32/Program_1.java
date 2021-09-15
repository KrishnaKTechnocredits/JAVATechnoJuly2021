package amol_Pawar.assignment_32;

public class Program_1 {

	void getMaxSumOfConsecutiveNum(int[] input) {
		int maxNum = input[0];
		int indexOfMaxValue = 0;
		for (int index = 0; index < input.length; index++) {
			if (index < input.length - 2) {
				if (1 == input[index + 1] - input[index] && 2 == input[index + 2] - input[index]) {
					if (maxNum < input[index]) {
						maxNum = input[index];
						indexOfMaxValue = index;
					}

				}
			}
		}
		int sum = maxNum + (maxNum + 1) + (maxNum + 2);
		System.out.println(input[indexOfMaxValue] + "," + input[indexOfMaxValue + 1] + "," + input[indexOfMaxValue + 2]
				+ " is a triple having max sum : " + sum);
	}

	public static void main(String[] args) {

		Program_1 program_1 = new Program_1();
		int[] arr = { 10, 64, 65, 66, 23, 24, 25, 26, 61, 62 };
		program_1.getMaxSumOfConsecutiveNum(arr);
	}
}

/*
 * Program 1: find the triple which in sequence and having maximum sum. int[]
 * arr = {10,64,65,66,23,24,25,26,61,62}; output : 64,65,66 is a triple having
 * maximum sum Note : 23,24,25 24,25,26 64,65,66 -> having max sum
 */
