package mratunjay.Assignment_12_To_18;

public class Assignment_14 {

	int getMaximumNumberFromArray(int[] num ) {
		int max=0;
		for(int index=0;index<num.length;index++) {
			if(num[index]>max)
				max=num[index];
		}
		return max;
	}
	
	int getMinimumNumberFromArray(int[] num ) {
		int min=num[0];
		for(int index=0;index<num.length;index++) {
			if(num[index]<min)
				min=num[index];
		}
		return min;
	}
	
	int getMaximumMinimumNumberDifference(int[] num) {
		int min = num[0];
		int max = 0;
		for (int index = 0; index < num.length; index++) {
			if (num[index] < min)
				min = num[index];
			if (num[index] > max)
				max = num[index];

		}
		return max - min;
	}
	
	int getMaxEvanMaxOddNumberDifference(int[] num) {
		int maxEven = 0;
		;
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
		int[] input = {1,11,44,23,55,99,23};
		Assignment_14 A_14 = new Assignment_14();
		System.out.println("Maximum number from given array is "+A_14.getMaximumNumberFromArray(input));
		int[] input1 = {1,11,44,23,55,99,23};
		System.out.println("Minimum number from given array is "+A_14.getMinimumNumberFromArray(input1));
		int[] input2 = { 1, 11, 44, 23, 55, 99, 23 };
		System.out.println("Difference between maximum and minimum number from given array is "
				+A_14.getMaximumMinimumNumberDifference(input2));
		int[] input4 = { 1, 11, 44, 23, 55, 99, 23, 22 };
		System.out.println("Difference between maximum odd and maximum even number from given array is "
				+A_14.getMaxEvanMaxOddNumberDifference(input4));
		
		
	}
}

