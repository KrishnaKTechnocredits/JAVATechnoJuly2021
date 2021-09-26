/*
Program 3: 
int[] arr = {10,23,24,25,26,61,62,64,65,66};
output : 3
Note : 23,24,25
       24,25,26
	   64,65,66
	   */


package harshada.Assignment_31;

import java.util.Arrays;

public class P3_FindConsecutiveNumbers {
	
	void getTriplets(int arr[]) {
		int count=0;
		boolean status=true;
		for(int index=0; index < arr.length-2; index++) {
			int num1=arr[index];
			int num2=arr[index+1];
			int num3=arr[index+2];
			if(num2==num1+1 && num3==num2+1 ) {
				count++;
			}
			
		}
		System.out.println("Count: "+ count);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P3_FindConsecutiveNumbers obj1=new P3_FindConsecutiveNumbers();
		int[] arr = {10,23,24,25,26,61,62,64,65,66};
		System.out.println("Consecutive Numbers in Array " + Arrays.toString(arr)+ " is : ");
		obj1.getTriplets(arr);
		int[] arr1 = {10,11,12,25,26,61,62,64,65,66};
		System.out.println("Consecutive Numbers in Array " + Arrays.toString(arr1)+ " is : ");
		obj1.getTriplets(arr1);
		int[] arr2 = {50,11,12,25,26,61,60,64,65,80};
		System.out.println("Consecutive Numbers in Array " + Arrays.toString(arr2)+ " is : ");
		obj1.getTriplets(arr2);
	}

}
