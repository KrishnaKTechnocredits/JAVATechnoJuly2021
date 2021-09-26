package precilla.codingtest7;

import java.util.Arrays;

public class Program1 {
	public static void main(String[] args) {
		Program1 program1=new Program1();
		System.out.println("Count the number of triplets in increasing order.");
		int[] arr = {10,9,11,6,23,25,22,66,34};
		System.out.println("Input "+Arrays.toString(arr));
		program1.getMaximumTripleSum(arr);
	}

	private void getMaximumTripleSum(int[] arr) {
		int count=0;
		for(int index=0;index<arr.length;index++) {
			if(index<=arr.length-3) {
				if(arr[index]< arr[index+1] &&arr[index+1]<arr[index+2]) {
					count++;
					System.out.println(count);
				}
					
			}
		}
	}
}
