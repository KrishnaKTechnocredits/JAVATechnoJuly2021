package gauravk.Assignment_27;

import java.util.Arrays;

/*
 * Assignment - 27 : 2nd Sep'2021

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
public class FindingIdenticalArrays {
	
	String comparingArrays(int[] arr1, int[] arr2) {
		
		System.out.println("Array 1: "+Arrays.toString(arr1));
		System.out.println("Array 2: "+Arrays.toString(arr2));
		
		if(arr1.length==arr2.length) {
			int s=0;
			for(int i=0; i<arr1.length;i++) {
				if(arr1[i]==arr2[i])
					s++;
			}
			if(s==arr1.length) {
				return "Identical";
			}
			else return "Not Identical";
		}
		else return "Not Identical";
	}
	
	public static void main(String[] args) {
		FindingIdenticalArrays findingIdenticalArrays = new FindingIdenticalArrays();
		int[] array1 = {10,12,55,32,17};
		int[] array2 = {10,12,55,32,17,99};
		int[] array3 = {10,12,99,32,17};
		System.out.println("output: "+findingIdenticalArrays.comparingArrays(array1, array1)+"\n");
		System.out.println("output: "+findingIdenticalArrays.comparingArrays(array1, array2)+"\n");
		System.out.println("output: "+findingIdenticalArrays.comparingArrays(array1, array3)+"\n");
	}
}
