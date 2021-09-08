/*
Program 1: Find second highest number from array.
int[] arr = {10,23,2,11,55,43,99};
output : 55

Program 2: Find nth highest number from array.
int[] arr = {10,23,2,11,55,43,99};
input n = 3;
output : 43
*/


package harshada.Assignment_28;

import java.util.Arrays;

public class Assignment_28_01 {
	
	
	void findSecondMaxNumber(int inputArray[])
	{
		System.out.println("Input Array elements are: "+ Arrays.toString(inputArray));
		int max=0;
		int secondMax=0;
		for(int index=0; index < inputArray.length; index++) {
			if(inputArray[index] > max) {
			secondMax=max;
			max=inputArray[index];
		}
		else 
			if(inputArray[index]> secondMax ) {
				secondMax=inputArray[index];
			}
	}
		//System.out.println("Maximum Number is = " +max);
		System.out.println("Second Maximum Number is = " +secondMax);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_28_01 obj=new Assignment_28_01();
		int a[]= {100,2,3,4,115,66,21,199};
		obj.findSecondMaxNumber(a);
	}

}
