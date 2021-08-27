//print difference between max and min number from given array.
package shreya;

public class MaxMinDifference {
	int getMaxNoFromArray(int[] num) {
		int max = num[0];
		for (int i = 1; i < num.length; i++) {
			if (num[i] > max)
				max = num[i];
		}
		return max;
	}
	
	int getMinNoFromArray(int[] num) {
		int min = num[0];
		for (int i = 1; i < num.length; i++) {
			if (num[i] < min)
				min = num[i];
		}
		return min;
	}

	public static void main(String[] args) {
		int[] input ={1,11,44,23,55,99,23};
		MaxMinDifference maxMinDifference=new MaxMinDifference();
		int max=maxMinDifference.getMaxNoFromArray(input);
		System.out.println("Maximum Number is "+max);
		int min=maxMinDifference.getMinNoFromArray(input);
		System.out.println("Minimum Number is "+min);
		int difference=max-min;
		System.out.println("Difference between maximum and minimum number is "+difference);
		
		
}
}
