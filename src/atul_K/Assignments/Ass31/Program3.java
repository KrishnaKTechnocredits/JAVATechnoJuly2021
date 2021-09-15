/*
find the no. of sequence of consecutive 3 no. from given array
 int[] arr = {10,23,24,25,26,61,62,64,65,66};
	output : 3
	Note : 23,24,25             	 24,25,26         	64,65,66
find the sequence with max. sum of consecutive 3 no. in sequence from given array
	out: 64,65,66
 */
package atul_K.Assignments.Ass31;

public class Program3 {

	int gettriplate(int[] arr){
		int count = 0;
		for (int index=0; index < arr.length-2;index++) {
			if (arr[index] == (arr[index+1]-1))
				if (arr[index] == (arr[index+2]-2))
				count++;	
		}
	return count;
	}
	
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
		System.out.println(arr[i]+","+arr[i+1]+","+arr[i+2]);
	}
	
	public static void main(String[] args) {
		int[] arr = {10,23,24,25,26,61,62,64,65,66};
		Program3 p3 = new Program3();
		System.out.println(p3.gettriplate(arr));
		p3.gettriplateWithMaxSum(arr);
	}
}
