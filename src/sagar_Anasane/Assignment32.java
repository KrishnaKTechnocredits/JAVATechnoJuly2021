/*Assignment - 32 : 10th Sep'2021

Program 1: find the triple which in sequence and having maximum sum.
int[] arr = {10,64,65,66,23,24,25,26,61,62};
output : 64,65,66 is a triple having maximum sum
Note : 23,24,25
       24,25,26
	   64,65,66 -> having max sum*/
package sagar_Anasane;

public class Assignment32 {
	void findTheTrippleHavingMaxSum(int[] arr){
		int maxSum=0;
		int element1=0;
		int element2=0;
		int element3=0;
		for(int index=0;index<arr.length-2;index++) {
			if(arr[index]<arr[index+1]) {
				if(arr[index+1]==arr[index]+1) {
					if(arr[index+2]==arr[index]+2) {
						int sum= arr[index]+arr[index+1]+arr[index+2];
						element1=arr[index];
						element2=arr[index+1];
						element3=arr[index+2];
						if(maxSum<sum) {
							maxSum=sum;
							System.out.println(element1+","+element2+","+element3+" is the Tripple which is in Sequence and having Maximum Sum");
						}
					}
				}
			}		
		}
	}
	public static void main(String[] args) {
		int[] input = {10,64,65,66,23,24,25,26,61,62};
		Assignment32 assignment32 = new Assignment32();
		assignment32.findTheTrippleHavingMaxSum(input);
	}
}
