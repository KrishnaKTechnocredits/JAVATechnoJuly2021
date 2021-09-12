package nidhi;

import java.util.Arrays;

/**Program 1: find the triple which in sequence and having maximum sum.
int[] arr = {10,64,65,66,23,24,25,26,61,62};
output : 64,65,66 is a triple having maximum sum
Note : 23,24,25 | 24,25,26  | 64,65,66 -> having max sum
**/

class Assignment_32{
	
	String getSumOfTriplets(int[] arr){
		int sum=0;
		int[] triplet = new int[3];
		for(int i =0;i<arr.length-2;i++){
			if (arr[i]+1 == arr[i+1]){
				if (arr[i]+2 == arr[i+2]){
					int total = arr[i] + arr[i+1] + arr[i+2];
					if (sum < total){
						sum = total;
						triplet[0]= arr[i];
						triplet[1]= arr[i+1];
						triplet[2]=	arr[i+2];
					}
				}
			}
		}
		return Arrays.toString(triplet);
	}
	
	public static void main(String[] arg){
		Assignment_32 assignment32= new Assignment_32();
		int[] arr = {10,64,65,66,23,24,25,26,61,62};
		System.out.println("Triplets with Max sum is :"+ assignment32.getSumOfTriplets(arr));
	}
}