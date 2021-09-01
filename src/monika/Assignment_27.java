/*Assignment - 27 : 2nd Sep'2021

 WAP to find 2 arrays are identical or not. 
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

package monika;

import java.util.Arrays;

public class Assignment_27 {

	void getIdenticalArray(int arr1[], int arr2[]) {
		
		if(Arrays.equals(arr1, arr2)) 
			System.out.println("The"+Arrays.toString(arr1)+" and "+Arrays.toString(arr2)+" Are Identical");
		else 
			System.out.println("The"+Arrays.toString(arr1)+" and "+Arrays.toString(arr2)+" Are Not Identical");
			
	}
	
	public static void main(String[] args) {
		Assignment_27 assignment_27=new Assignment_27();
		int[] arr1 = {10,12,55,32,17};
		int[] arr2 = {10,12,55,32,17};
		assignment_27.getIdenticalArray(arr1, arr2);
		System.out.println("--------------------------------------------------------------");
		int[] arr3 = {10,12,55,32,17,99};
		int[] arr4 = {10,12,55,32,17};
		assignment_27.getIdenticalArray(arr3, arr4);
		System.out.println("--------------------------------------------------------------");
		int[] arr5 = {10,12,55,32,17};
		int[] arr6 = {10,12,99,32,17};
		assignment_27.getIdenticalArray(arr5, arr6);
		
	}
}
