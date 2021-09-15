package indu;

import java.util.Arrays;

public class CompareArray_A27 {

	void compareArrayElements(int[] num1 , int[] num2)
	{
		int index = 0 ;
		boolean flag = true;
		if(num1.length==num2.length )
		{
			while(index<num1.length)
			{
				 if(num1[index]!=num2[index]) 
				 {	
					flag=false;
			 		break;
				 }
				else {
					index++;
					flag=true;
				}
			 }
			 if(flag)
				System.out.println("Identical");
			 else 
				System.out.println("Non-Identical");
		  }
		  else
			  System.out.println("Non-Identical");
			
	}
	
	public static void main(String[] arg)
	{
		CompareArray_A27 compareArray_A27 = new CompareArray_A27();
		int[] num1 = {10,12,55,32,17};
		int[] num2 = {10,12,55,32,17};
		System.out.println("Input Array is :\n" + Arrays.toString(num1)+"\n" + Arrays.toString(num2));
		compareArray_A27.compareArrayElements(num1, num2);
		System.out.println("----------------------------------");
		int[] arr1 = {10,12,55,32,17,99};
		int[] arr2 = {10,12,55,32,17};
		System.out.println("Input Array is :\n" + Arrays.toString(arr1)+"\n" + Arrays.toString(arr2));
		compareArray_A27.compareArrayElements(arr1, arr2);
		System.out.println("----------------------------------");
		int[] number1 = {10,12,55,32,17};
		int[] number2 = {10,12,99,32,17};
		System.out.println("Input Array is :\n" + Arrays.toString(number1)+"\n" + Arrays.toString(number2));
		compareArray_A27.compareArrayElements(number1, number2);
		
	}
}
