package aniket;

public class MinNumberArray {

	int getMinNumber(int[] num) {
		int minNumber = num[0];
		for(int index = 0; index < num.length; index++) {
			if(num[index] < minNumber) {
				minNumber = num[index];
			}
		}
		return minNumber;
	}

	public static void main(String[] args) {
		MinNumberArray minnumber = new MinNumberArray();
		int[] input = {11,44,23,55,1,99,23};
		System.out.println("Smallest number if an aaray: " +minnumber.getMinNumber(input));
	}

}