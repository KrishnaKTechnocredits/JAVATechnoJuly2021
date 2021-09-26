/* Assignment - 27 : 

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
package santosh;
import java.util.Arrays;
public class ArrayIdenticalOrNot_27 {

	void arrayAreIdenticalOrNot(int[] numarr1, int[] numarr2) {

		if(Arrays.equals(numarr1, numarr2))
			System.out.println("Arrays are Identical");
		else
			System.out.println("Arrays are Not Identical");
	}


	public static void main(String[] args) {
		ArrayIdenticalOrNot_27 arrayidenticalornot = new ArrayIdenticalOrNot_27();
		int[] arr1 = {10,12,55,32,17,99};
		int[] arr2 = {10,12,55,32,17};
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		arrayidenticalornot.arrayAreIdenticalOrNot(arr1, arr2);

		int[] arr3 = {10,12,55,32,17};
		int[] arr4 = {10,12,55,32,17};
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		arrayidenticalornot.arrayAreIdenticalOrNot(arr3, arr4);
		
		int[] arr5 = {10,12,55,32,17};
		int[] arr6 = {10,12,99,32,17};
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		arrayidenticalornot.arrayAreIdenticalOrNot(arr5, arr6);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
}
