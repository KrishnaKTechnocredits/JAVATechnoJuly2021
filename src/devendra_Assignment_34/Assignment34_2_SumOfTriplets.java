package devendra_Assignment_34;

import java.util.Arrays;

public class Assignment34_2_SumOfTriplets {
	int getLengthOfArray(int[] a) {
		int count=0;
		for(int i=0;i<a.length-2;i++) {
			if(a[i]+1==a[i+1] && a[i+2]==a[i+1]+1) {
						count++;
					}
		}
		return count;
	}

	int[] placeSumAfterArray(int[] a) {
		int length = a.length+getLengthOfArray(a);
		int[] output = new int[length];
		int index = 0;
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			if(i < a.length - 2) {
				if(a[i] + 1 == a[i + 1] && a[i + 2] == a[i + 1] + 1) {
					output[index] = a[i];
					index++;
					output[index] = a[i + 1];
					index++;
					output[index] = a[i + 2];
					index++;
					output[index] = a[i] + a[i + 1] + a[i + 2];
					index++;
					i = i + 2;
				} else {
					output[index] = a[i];
					index++;
				}
			} else {
			output[index] = a[i];
			}
		}
		return output;
	}

	public static void main(String[] args) {
		int[] input = {1,3,4,5,7,9,10,11,14,44,67,1,2,3,99};
		System.out.println("Input : " +Arrays.toString(input));
		int[] output = new Assignment34_2_SumOfTriplets().placeSumAfterArray(input);
		System.out.println("Output : " +Arrays.toString(output));
	}
}
