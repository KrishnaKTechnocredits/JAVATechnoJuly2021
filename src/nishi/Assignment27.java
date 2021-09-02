package nishi;

import java.util.Arrays;

public class Assignment27 {
	
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
		Assignment27 assignment27=new Assignment27();		
		int[] arr1= {10,12,55,32,17};
		int[] arr2= {10,12,55,32,17};
		int[] arr3= {10,12,55,32,17,99};
		int[] arr4= {10,12,99,32,17};
		System.out.println("For Arrays "+Arrays.toString(arr1)+" and " +Arrays.toString(arr2)+"\n"+assignment27.getArraysIdenticalOrNotMsg(arr1, arr2));				
		System.out.println("For Arrays "+Arrays.toString(arr3)+" and " +Arrays.toString(arr2)+"\n"+assignment27.getArraysIdenticalOrNotMsg(arr3, arr2));
		System.out.println("For Arrays "+Arrays.toString(arr1)+" and " +Arrays.toString(arr4)+"\n"+assignment27.getArraysIdenticalOrNotMsg(arr1, arr4));
			
	}

}
