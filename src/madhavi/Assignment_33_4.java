package madhavi;

import java.util.Arrays;

public class Assignment_33_4 {

	void getTripletsSequenceCount(int[] input) {
		int maxSum = 0;
		int n1=0,n2=0,n3=0;
		for (int index = 0; index < input.length - 2; index++) {
			if (input[index + 1] == input[index] + 1 && input[index + 2] == input[index + 1] + 1) {
				int sum =  input[index] + input[index + 1] + input[index + 2];
				if(maxSum<sum) {
					maxSum=sum;
					n1 = input[index];
					n2 = input[index + 1];
					n3 = input[index + 2];
					
				}	
			}
		}
		System.out.println("Triplets are - " + n1 + " " + n2 + " " +n3);
		System.out.println("Sum of triplets-" + maxSum);
	}
	public static void main(String[] args) {
		Assignment_33_4 assignment_33_4 = new Assignment_33_4();
		int[] arr =  {1,3,4,5,7,3,9,10,11,12,44,67,1,2,3,99};
		System.out.println("triplets sequence array " + Arrays.toString(arr));
		assignment_33_4.getTripletsSequenceCount(arr);
	}
}