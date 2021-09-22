/*Assignment - 32 : 10th Sep'2021
Program 1: find the triple which in sequence and having maximum sum.
int[] arr = {10,64,65,66,23,24,25,26,61,62};
output : 64,65,66 is a triple having maximum sum
Note : 23,24,25             	   24,25,26                      	64,65,66 -> having max sum
 */
package atul_K.Assignments.Ass32;

public class Program1 {
	void gettriplateWithMaxSum(int[] arr){
		int maxSum =0;
		int i =0;
		
		for (int index=0; index < arr.length-2;index++) {
			int sum;
			if (arr[index] == (arr[index+1]-1)) {
				if (arr[index] == (arr[index+2]-2)) {
					sum = arr[index]+ arr[index+1] + arr[index+2];
					if (maxSum < sum) {
					maxSum = sum;
					i = index;
					}
				}
			}
		}
		System.out.println("sequence with highest sum : "+arr[i]+","+arr[i+1]+","+arr[i+2]);
	}
	
	public static void main(String[] args) {
		int[] arr = {10,23,24,25,26,61,62,64,65,66};
		Program1 p1 = new Program1();
		p1.gettriplateWithMaxSum(arr);
	}
}
