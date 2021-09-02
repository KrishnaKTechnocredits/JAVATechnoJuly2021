package trupti;

import java.util.Arrays;

public class Assignment_27 {
	 
	public static void main(String[] args){
		 int[] arr1= {10,12,55,32,17};
		 int[] arr2= {10,12,55,32,17};
		 
		 int[] arr3= {10,12,15,32,17};
		 int[] arr4= {10,12,55,32,17};
		 
		 int[] arr5= {10,12,55,32,17};
		 int[] arr6= {10,12,55,05,17};
		 
		 
		  if(Arrays.equals(arr1,arr2) )
			System.out.println("arr1 and arr2 are Identical array");
		  else
			System.out.println("Not Identical array");
		  
		  if(Arrays.equals(arr3,arr4) )
				System.out.println("Identical array");
			  else
				System.out.println("arr2 and arr3 are Not Identical array");
		  
		  if(Arrays.equals(arr5,arr6) )
				System.out.println("Identical array");
			  else
				System.out.println("arr5 and arr6 are Not Identical array");
}
}
