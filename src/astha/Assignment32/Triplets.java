/*Assignment - 32 : 10th Sep'2021
 
Program 1: find the triple which in sequence and having maximum sum.
int[] arr = {10,64,65,66,23,24,25,26,61,62};
output : 64,65,66 is a triple having maximum sum
Note : 23,24,25             	   24,25,26                      	64,65,66 -> having max sum*/
 
package astha.Assignment32;

public class Triplets {

	void getTripletsWithMaxSum(int[] input) {
		int sum = 0;
		int tripletSum = 0;
		int maxIndex = 0;
		for (int index = 0; index < input.length - 2; index++) {
			if ((input[index] == (input[index + 1] - 1)) && (input[index + 1] == (input[index + 2] - 1))) {
				tripletSum = input[index] + input[index + 1] + input[index + 2];
				if (tripletSum > sum) {
					sum = tripletSum;
					maxIndex = index;
				}
			}
		}
		System.out.println("The triplets ["+ input[maxIndex]+ " " + input[maxIndex+1] + " " + input[maxIndex+2] + "] have maximum sum : " + sum);
		
		}
	
	public static void main(String[] args) {
		Triplets triplets = new Triplets();
		int[] input = {10,64,65,66,23,24,25,26,61,62};
		triplets.getTripletsWithMaxSum(input);
	}

}
