/*program 4 : find the triple which in sequence and having maximum sum

input = {1,3,4,5,7,3,9,10,11,12,44,67,1,2,3,99};
iteration : 3,4,5
         9,10,11
		 10,11,12
         1,2,3
output : 10,11,12*/
package shreya_assignment_33;

import java.util.Arrays;

public class TripletWithMaxSum {
	void  gettripletWithmaxSum(int[] input) {
		int sum=0;
		int maxIndex=0;
		int tripletSum=0;
		
		for(int index=0;index<input.length-2;index++) {
			if(input[index]==input[index+1]-1 && input[index+1]==input[index+2]-1) {
				tripletSum=input[index]+input[index+1]+input[index+2];
				if(sum<tripletSum) {
					sum=tripletSum;
					maxIndex=index;
				}
			}
		}
		System.out.println("Triplet with maximum sum : "+input[maxIndex]+","+input[maxIndex+1]+","+input[maxIndex+2]);
		
	
	}
	public static void main(String[] args) {
		TripletWithMaxSum tripletWithMaxSum=new TripletWithMaxSum();
		int[] input= {1,3,4,5,7,3,9,10,11,12,44,67,1,2,3,99};
		System.out.println("Input: "+Arrays.toString(input));
		tripletWithMaxSum.gettripletWithmaxSum(input);
		

	}

}
