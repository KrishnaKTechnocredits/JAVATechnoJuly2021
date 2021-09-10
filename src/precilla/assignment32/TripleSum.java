package precilla.assignment32;

import java.util.Arrays;

public class TripleSum {
	/*.
	
	output : 64,65,66 is a triple having maximum sum
	Note : 23,24,25
	       24,25,26
		   64,65,66 -> having max sum
		   */
	public static void main(String[] args) {
		TripleSum tripleSum=new TripleSum();
		System.out.println("Program 1: find the triple which in sequence and having maximum sum");
		int[] arr = {10,64,65,66,23,24,25,26,61,62};
		System.out.println("Input "+Arrays.toString(arr));
		tripleSum.getMaximumTripleSum(arr);
		
	}

	private void getMaximumTripleSum(int[] arr) {
		int sum=0;
		int maxSum=0;
		for(int index=0;index<arr.length;index++) {
			if(index<=arr.length-3) {
				if(arr[index]+1== arr[index+1] &&arr[index]+2==arr[index+2]) {
				sum=arr[index]+arr[index+1]+arr[index+2];
					if(sum>maxSum) {
						maxSum=sum;
						System.out.println(arr[index]+" "+arr[index+1]+" "+arr[index+2]);
				}
					
			}
		}
	}
	}

}
