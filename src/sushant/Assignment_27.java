/*WAP to find 2 arrays are identical or not. 
int[] arr1 = {10,12,55,32,17};
int[] arr2 = {10,12,55,32,17}};
output : Identical
--------------------------------------------
int[] arr1 = {10,12,55,32,17,99};
int[] arr2 = {10,12,55,32,17}};
output : Not identical
------------------------------------
int[] arr1 = {10,12,55,32,17};
int[] arr2 = {10,12,99,32,17}};
output : Not Identical*/

package sushant;

import java.util.Arrays;

public class Assignment_27 {

	String getArraysIdenticalOrNotMsg(int[] input1,int[] input2 )
	{
		String msg="";		
		if(input1.length==input2.length)
		{
			for(int i=0;i<input1.length;i++)
			{
				if(input1[i]==input2[i])
				{
					msg ="Identical";
				}
				else
				{
					msg="Not Identical";
					break;
				}
			}

		}
		else
		{
			msg="Not Identical";
		}
		return msg;
	}

	public static void main(String[] args) {
		Assignment_27 assignment_27 = new Assignment_27();		
		int[] arr1= {10,12,55,32,17};
		int[] arr2= {10,12,55,32,17};
		int[] arr3= {10,12,55,32,17,99};
		int[] arr4= {10,12,99,32,17};
		System.out.println("For Arrays "+Arrays.toString(arr1)+" and " +Arrays.toString(arr2)+"\n"+assignment_27.getArraysIdenticalOrNotMsg(arr1, arr2));				
		System.out.println("For Arrays "+Arrays.toString(arr3)+" and " +Arrays.toString(arr2)+"\n"+assignment_27.getArraysIdenticalOrNotMsg(arr3, arr2));
		System.out.println("For Arrays "+Arrays.toString(arr1)+" and " +Arrays.toString(arr4)+"\n"+assignment_27.getArraysIdenticalOrNotMsg(arr1, arr4));

	}

}
