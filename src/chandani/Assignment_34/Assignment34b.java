package chandani.Assignment_34;

import java.util.Arrays;

public class Assignment34b {
	
	int count = 0;
	int newindex = 2;
	int num;
	int index = 0;
	int sum = 0;
	
	void getIncreasingTripletsCountAndSum(int[] input) {
	
		for(int index = 0; index < input.length - 2; index++) {
			num = input[index]; 
			if(num+1 == input[index+1]) {
				if(num+2 == input[index+2]) {
					count++;
					System.out.println("Triplet numbers in increasing order : " + input[index] + ","
							+ input[index +1] + "," + input[index + 2]);
					sum = input[index] + input[index+1] + input[index+2];

					System.out.println("Sum of triplets is : " + sum);
				}
			}
		}
		System.out.println("\n" + "Count of sequential triplets " + count);

			
		int[] output =new int[input.length + count];
		output[0]=input[0];
		output[1]=input[1];
		for(index=2;index<input.length;index++) {
			output[newindex++]=input[index];
			if(input[index-1]==input[index-2]+1 && input[index]==input[index-1]+1) 
				output[newindex++]=input[index]+input[index-1]+input[index-2];
		}
    	System.out.println("\n" + "After adding zeros after sequential triplets from the given array " +Arrays.toString(input) + "\nthe output is " +Arrays.toString(output));

	}
	

	public static void main(String[] args) {
		Assignment34b assignment34b = new Assignment34b();
		int [] arr = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99};
		assignment34b.getIncreasingTripletsCountAndSum(arr);

	}
}
