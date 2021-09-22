/*
 Program 1: Count the number of triplets in increasing order. [expected time : 10 mins]
input : 10,9,11,6,23,25,22,66,34
ouput : 1
hint : 6,23,25
 */
package atul_K.Assignments.ProgramTest7;

public class ProgramTest7 {
	int getIncreasingTriplets(int[] arr) {
		int count=0;
		for(int index =0; index < arr.length-1; index++) {
			
			if (arr[index] < arr[index+1]) {
				if (arr[index+1] < arr[index+2]) {
					count++;
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int [] arr = {10,9,11,6,23,25,22,66,34};
		ProgramTest7 t7 = new ProgramTest7();
		System.out.println(t7.getIncreasingTriplets(arr));
	}
}
//time taken 11 min
