/* Test - 7 : 11th Sep
Program 1: Count the number of triplets in increasing order. [expected time : 10 mins]
input : 10,9,11,6,23,25,22,66,34
ouput : 1
hint : 6,23,25 */

package akanksha_Jain;

import java.util.Arrays;

public class Coding_Test_7 {
	
	void findTripleSeqIncreasingOrder(int[] arr) {
		int[] output = new int[3];
		for(int index=0; index<arr.length-2; index++) {
			if(arr[index]<arr[index+1]) {
				if(arr[index+1]<arr[index+2]) {
					output[0] = arr[index];
					output[1] = arr[index+1];
					output[2] = arr[index+2];
				}
			}
		}
		System.out.println(Arrays.toString(output) + " is a triplet in increasing order");
	}
	
	public static void main(String[] args) {
		int[] arr = {10,9,11,6,23,25,22,66,34};
		Coding_Test_7 codingTest7 = new Coding_Test_7();
		codingTest7.findTripleSeqIncreasingOrder(arr);
	}		
}
