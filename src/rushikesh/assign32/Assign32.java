package rushikesh.assign32;
/*
 Assignment - 32 : 10th Sep'2021

Program 1: find the triple which in sequence and having maximum sum.
int[] arr = {10,64,65,66,23,24,25,26,61,62};
output : 64,65,66 is a triple having maximum sum
Note : 	23,24,25
       	24,25,26
	64,65,66 -> having max sum

 */

public class Assign32 {

	void getTripletHavingMaxSum(int[] input) {
		int maxSum=0;
		int sum = 0;
		int tripindex=0;
		
		for(int index=0;index<input.length-2;index++) {

			if(input[index]+1==input[index+1] && input[index]+2==input[index+2] ) {
			sum=input[index]+input[index+1]+input[index+2];
				if(sum>maxSum) {
					maxSum=sum;
					tripindex=index;
				}
			}
		}
			System.out.println("The triple " + input[tripindex] + ", " + input[tripindex + 1] + ", " + input[tripindex + 2]
				+ " is triple having max sum");	
	}
	
	public static void main(String[] args) {
		Assign32 assign32=new Assign32();
		int[] arr = {10,64,65,66,23,24,25,26,61,62};
		assign32.getTripletHavingMaxSum(arr);
	}
}
