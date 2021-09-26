/*Assignment - 32 : 10th Sep'2021

Program 1: find the triple which in sequence and having maximum sum.
int[] arr = {10,64,65,66,23,24,25,26,61,62};
output : 64,65,66 is a triple having maximum sum
Note : 23,24,25
       24,25,26
	   64,65,66 -> having max sum*/
package varun.varun_different_programs;

public class SumOfAllTriplets {
	int sum=0;
	int maxSum=0;
	int temp=0;
	void sumOfTriplets(int []input) {
		for(int index=0;index<input.length-2;index++) {
			if(input[index]+1 == input[index+1] && input[index]+2 == input[index+2]) {
				sum += (input[index] + input[index+1] + input[index+2]);
				if(maxSum<sum) {
					System.out.println("Triplet numbers are "+input[index] +"," +input[index+1] +"," +input[index+2]);
					maxSum = sum;
					sum =0;
			}
		}
		}
		System.out.println("Sum of these Triplet numbers are " +maxSum);
	}
	public static void main(String[] args) {
		int[] arr = {10,64,65,66,23,24,25,26,61,62};
		SumOfAllTriplets sumOfAllTriplets = new SumOfAllTriplets();
		sumOfAllTriplets.sumOfTriplets(arr);
	}
}
