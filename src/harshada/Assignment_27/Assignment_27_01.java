/*
 Assignment - 27 : 2nd Sep'2021

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
output : Not Identical
 */
package harshada.Assignment_27;

import java.util.Arrays;

public class Assignment_27_01 {

	void processIdenticalArray(int arr1[], int arr2[]){
		
			if(Arrays.equals(arr1, arr2)) {
				System.out.println("Given two Arrays are Identical");
			}
			else {
				System.out.println("Given two Arrays are not Identical ");
			}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_27_01 assignment_27_01=new Assignment_27_01();
		int array1[]= {10,12,55,32,17};
		int array2[]= {10,12,55,32,17};
		assignment_27_01.processIdenticalArray(array1, array2);
		int array3[]= {10,12,55,32,17,99};
		int array4[]= {10,12,55,32,17};
		assignment_27_01.processIdenticalArray(array3, array4);
		int array5[]= {10,12,55,32,17};
		int array6[]= {10,12,88,32,17};
		assignment_27_01.processIdenticalArray(array5, array6);
	}

}
