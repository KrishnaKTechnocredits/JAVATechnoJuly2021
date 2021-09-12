/*Program 1 : shift all non zeros at the end.
input : {1,0,3,4,0,2,88,0,0,22,34};
output : [0,0,0,0,1,3,4,2,88,22,34]

Program 2: place all negative numbers at the beginning and all positive numbers at the end.
input = {1,-3,-2,11,44,55,-76,33,12};
output : [-3,-2,-76,1,11,44,55,33,12]

program 3: place all negative numbers at the beginning, zeros and all positive numbers at the end.
input = {1,-3,0,-2,11,0,44,55,-76,33,0,12};
output : [-3,-2,-76,0,0,0,1,11,44,55,33,12]

program 4 : find the triple which in sequence and having maximum sum

input = {1,3,4,5,7,3,9,10,11,12,44,67,1,2,3,99};
iteration : 3,4,5
         9,10,11
		 10,11,12
         1,2,3
output : 10,11,12
*/

package ritabrata2;

import java.util.Arrays;

public class Assignment33 {
	void shiftNonZero(int[] input) {
		System.out.println("The input is: "+Arrays.toString(input));
		int count =0, n=input.length, j=input.length-1;
		int[] arr= new int[input.length];
		for(int i=0; i<n; i++) {
			if(input[i]==0) {
				arr[count++]=input[i];
			}
			else
				arr[j--]=input[i];
		}
		System.out.println("The array after shifting the non-zeros: "+Arrays.toString(arr));
	}
	
	void shiftNegative(int[] input) {
		System.out.println("The input is: "+Arrays.toString(input));
		int count =0, n=input.length, j=input.length-1;
		int[] arr= new int[input.length];
		for(int i=0; i<n; i++) {
			if(input[i]<0) {
				arr[count++]=input[i];
			}
			else
				arr[j--]=input[i];
		}
		System.out.println("The array after shifting the positives: "+Arrays.toString(arr));
	}
	
	void arrangeAssending(int[] input) {
		System.out.println("The input is: "+Arrays.toString(input));
		int count =0, n=input.length, countZero=0, countPos=0;
		int[] arr= new int[input.length];
		for(int i=0; i<n; i++) {
			if(input[i]<0) {
				arr[count++]=input[i];
			}
			if(input[i]==0) {
				countZero++;	
			}
			countPos=count+countZero;
		}
		int cnt=countPos;
		for(int k=0;k<input.length;k++) {
			if(input[k]>0) {
				arr[cnt]=input[k];
				cnt++;
			}	
		}
		System.out.println("The array after shifting the zeros: "+Arrays.toString(arr));
	}
	
	void findTripletMaxSum(int[] input) {
		System.out.println("The input is: "+Arrays.toString(input));
		int sum=0, maxSum=0, tripletIndex=0;
		for(int index=0; index<input.length-2;index++) {
			if(input[index]+1==input[index+1] && input[index+1]+1==input[index+2]) {
				sum=input[index]+input[index+1]+input[index+2];
				if(sum>maxSum) {
					maxSum=sum;
					tripletIndex=index;
				}
			}
		}
		System.out.println("The triplet with max sum is :"+input[tripletIndex]+", "+input[tripletIndex+1]+", "+input[tripletIndex+2]+" and the total sum is: "+maxSum);
	}

	public static void main(String[] args) {
		Assignment33 assignment =new Assignment33();
		int[] arr={1,0,3,4,0,2,88,0,0,22,34};
		assignment.shiftNonZero(arr);
		System.out.println("----------------------------------");
		int[] arr1={1,-3,-2,11,44,55,-76,33,12};
		assignment.shiftNegative(arr1);
		System.out.println("----------------------------------");
		int[] arr2={1,-3,0,-2,11,0,44,55,-76,33,0,12};
		assignment.arrangeAssending(arr2);
		System.out.println("----------------------------------");
		int[] arr3 = {1,3,4,5,7,3,9,10,11,12,44,67,1,2,3,99};
		assignment.findTripletMaxSum(arr3);
		
	}

}
