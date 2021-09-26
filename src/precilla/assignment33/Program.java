/*Assignment - 33 : 11th Sep'2021
 * Program 1 : shift all non zeros at the end.
 * Program 2: place all negative numbers at the beginning and all positive numbers at the end.
 * program 3: place all negative numbers at the beginning, zeros and all positive numbers at the end.
 * program 4 : find the triple which in sequence and having maximum sum


 */

package precilla.assignment33;

import java.util.Arrays;

public class Program {
	public static void main(String[] args) {
		Program program=new Program();
		int[] arr={1,0,3,4,0,2,88,0,0,22,34};
		int[] arr1= {1,-3,-2,11,44,55,-76,33,12};
		int[] arr2= {1,-3,0,-2,11,0,44,55,-76,33,0,12};
		int[] arr3= {1,3,4,5,7,3,9,10,11,12,44,67,1,2,3,99};
		System.out.println("Program 1 : shift all non zeros at the Beginning.");
		System.out.print("Input :"+Arrays.toString(arr));
		program.getNonZeroAtBeg(arr);
		System.out.println("\nProgram 2: place all negative numbers at the beginning and all positive numbers at the end.");
		System.out.print("Input :"+Arrays.toString(arr1));
		program.getNegativeAtBeg(arr1);
		System.out.println("\nprogram 3: place all negative numbers at the beginning, zeros and all positive numbers at the end.");
		System.out.print("Input :"+Arrays.toString(arr2));
		program.getNegativeAtBegZeroMid(arr2);
		System.out.println("\nprogram 4: find the triple which in sequence and having maximum sum");
		System.out.print("Input :"+Arrays.toString(arr3));
		program.getTripleInSequence(arr3);

	}
	private void getTripleInSequence(int[] arr3) {
		int sum=0,maxSum=0;
		int tripleMax[]=new int[3];
		int index1=0;
		for(int index=0;index<=arr3.length-3;index++) {
				if(arr3[index]+1==arr3[index+1]&&arr3[index]+2==arr3[index+2]) {
					sum=arr3[index]+arr3[index+1]+arr3[index+2];
					if(sum>maxSum) {
						maxSum=sum;	
						tripleMax[index1]=arr3[index];
						tripleMax[index1+1]=arr3[index+1];
						tripleMax[index1+2]=arr3[index+2];	
					}
				}
			}	
		System.out.println("\nOutput : "+Arrays.toString(tripleMax));
	}
	
	private void getNegativeAtBegZeroMid(int[] arr2) {
		int count=0;
		int zeroCount=0;
		int outIndex=0;
		int[] out=new int[arr2.length];
		for(int index=0;index<arr2.length;index++) {
			if(arr2[index]<0) {
				out[count]=arr2[index];
				count++;
			}
			if(arr2[index]==0) {
				zeroCount++;
			}
		}
		outIndex=count+zeroCount;
		for(int index=0;index<arr2.length;index++) {
			if(arr2[index]>0) {
				out[outIndex]=arr2[index];
				outIndex++;
			}
		}
		System.out.println("\nOutput:"+Arrays.toString(out));
		
	}

	private void getNegativeAtBeg(int[] arr1) {
		int count=0;
		int[] out=new int[arr1.length];
		for(int index=0;index<arr1.length;index++) {
			if(arr1[index]<=0) {
				out[count]=arr1[index];
				count++;
			}
		}
		for(int index=0;index<arr1.length;index++) {
			if(arr1[index]>0) {
				out[count]=arr1[index];
				count++;
			}
		}
		System.out.println("\nOutput:"+Arrays.toString(out));
	}
	private void getNonZeroAtBeg(int[] arr) {
		int count=0;
		int[] out=new int[arr.length];
		for(int index=0;index<arr.length;index++) {
			if(arr[index]==0)
				count++;
		}
		for(int index=0;index<arr.length;index++) {
			if(arr[index]!=0) {
				out[count]=arr[index];
				count++;
			}
		}
		System.out.println("\nOutput:"+Arrays.toString(out));
		
	}

}
