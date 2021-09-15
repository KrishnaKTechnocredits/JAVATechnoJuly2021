package gauravk.Assignment_32;
/*
 * Assignment - 32 : 10th Sep'2021

Program 1: find the triple which in sequence and having maximum sum.
int[] arr = {10,64,65,66,23,24,25,26,61,62};
output : 64,65,66 is a triple having maximum sum
Note : 23,24,25
       24,25,26
	   64,65,66 -> having max sum
 */
public class TripletWithMaxSum {

	void getTripletWithMaxSum(int[] input) {
		int sum = 0;
		int maxSum = 0;
		int index = 0;
		int counterIndex = 0;
		System.out.println("The triplets are: ");
		while (index < input.length - 2) {
			int num1 = input[index];
			if ((input[index + 1] == num1 + 1) && (input[index + 2] == num1 + 2)) {
				sum = input[index] + input[index + 1] + input[index + 2];
				System.out.println(input[index]+","+input[index+1]+","+input[index+2]);
			}
			index++;
			if (maxSum < sum) {
				maxSum = sum;
				counterIndex=index;
				sum = 0;
			}
		}
		System.out.println("Max sum of triplets is --> " + maxSum);
		System.out.println("Triplet with maximum sum is "+input[counterIndex]+","+input[counterIndex+1]+","+input[counterIndex+2]);

	}

	public static void main(String[] args) {
		int[] arr = { 10, 64, 65, 66, 23, 24, 25, 26, 61, 62 };
		TripletWithMaxSum tripletWithMaxSum = new TripletWithMaxSum();
		tripletWithMaxSum.getTripletWithMaxSum(arr);
	}
}