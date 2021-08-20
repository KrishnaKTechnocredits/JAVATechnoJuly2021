package trupti;

public class Assignment_15_2 {
	
	void diffOfOddAndEvenNo(int[] num) {
		int even = 0;
		int odd = 0;
		int sumDiff = 0;

		for (int index = 0; index < num.length; index++) {
			if (num[index] % 2 == 0) {
				even += num[index];
			} else {
				odd += num[index];
			}
		}
		sumDiff = even - odd;
		//return sumDiff;
		System.out.println("Difference of sum of even and odd number in array is: " + sumDiff);
	}

	public static void main(String[] args) {
		Assignment_15_2 assignment_15_2 = new Assignment_15_2();
		int[] arr = { 22, 2, 23, 13, 1, 41, 36, 56 };
		assignment_15_2.diffOfOddAndEvenNo(arr);
	}

}
