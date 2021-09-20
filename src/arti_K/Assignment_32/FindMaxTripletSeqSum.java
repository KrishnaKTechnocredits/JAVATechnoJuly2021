/*	Program 1: find the triple which in sequence and having maximum sum.
int[] arr = {10,64,65,66,23,24,25,26,61,62};
output : 64,65,66 is a triple having maximum sum
Note : 23,24,25
       24,25,26
	   64,65,66 -> having max sum
 */

package arti_K.Assignment_32;

public class FindMaxTripletSeqSum {
	
	void findMaxConsecutiveNumberSum(int[] arr) {
		int count = 0;
		int sum = 0;
		int consnumIndex = 0;
		int ConsNumSum = 0;
		
		for(int index = 0; index < arr.length-2; index++) {
			if(arr[index]+1 == arr[index+1] && arr[index+1]+1 == arr[index + 2]) {
				count++;
				sum = arr[index] + arr[index+1] + arr[index+2];
				
				if(sum > ConsNumSum) {
					ConsNumSum = sum;
					consnumIndex = index;
				}
			}	
		}
		System.out.println("Total count of Consecutive Number is : "+count);
		System.out.println(arr[consnumIndex]+","+arr[consnumIndex+1]+","+arr[consnumIndex+2]+" is a triple having maximum sum "+ConsNumSum);
	}
		
	public static void main(String[] args) {
		int[] arr = {10,64,65,66,23,24,25,26,61,62};
		new FindMaxTripletSeqSum().findMaxConsecutiveNumberSum(arr);
	}
}
