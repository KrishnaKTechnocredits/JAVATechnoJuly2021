package dattaraj;

public class Assignment_14_P4 {
	
	int getMaxMinOENumDiff(int[] num) {
		int maxEven = 0;
		int maxOdd = 0;
		for (int index = 0; index < num.length; index++) {
			if (num[index] % 2 == 0) {
				if (num[index] > maxEven)
					maxEven = num[index];
			} else if (num[index] > maxOdd)
				maxOdd = num[index];

		}
		if (maxOdd - maxEven > 0)
			return maxOdd - maxEven;
		else
			return maxEven - maxOdd;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 1, 11, 44, 23, 55, 99, 23, 22 };
		Assignment_14_P4 arrayP4 = new Assignment_14_P4();
		System.out.println("Difference between maximum odd and maximum even number from given array is "
				+ arrayP4.getMaxMinOENumDiff(input));
	}

}
