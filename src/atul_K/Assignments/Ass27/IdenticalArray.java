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
package atul_K.Assignments.Ass27;

public class IdenticalArray {

	
	
	boolean identifyTheArrayisIdentical(int[] arr1, int[] arr2) {
		boolean flag = true;
		if (arr1.length == arr2.length) {
			for (int index=0;index<arr1.length;index++) {
				if(arr1[index] != arr2[index])
					flag = false;
			}
		}else {
			flag = false;
		}
		
		return flag;
	}
	
	public static void main(String[] args) {
		int[] arr1 = {10,12,55,32,17};
		int[] arr2 = {10,12,5,32,17};
		IdenticalArray i1 = new IdenticalArray();
		if (i1.identifyTheArrayisIdentical(arr1, arr2))
			System.out.println("provided arrays are identical");
		else {
			System.out.println("provided arrays are not identical");
		}
	}
}
