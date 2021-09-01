/*
 *Assignment - 27 : 2nd Sep'2021

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
package sayli_Vyavhare;

public class IdenticalArray_assign27 {

	void getArrayIdenticalOrNot(int[] arr1, int[] arr2) {
		int temp = 0;
		for (int index = 0; index < arr1.length; index++) {
			for (int innerindex = 0; innerindex < arr2.length; innerindex++) {
				if (arr1[index] == arr2[innerindex]) {
					temp++;
				}
			}
		}
		if (temp == arr1.length)
			System.out.println("Identical arrays");

		else
			System.out.println("Not identical Array");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IdenticalArray_assign27 identicalarray = new IdenticalArray_assign27();

		int[] arr1 = { 10, 12, 55, 32, 17 };
		int[] arr2 = { 10, 12, 55, 32, 17 };
		identicalarray.getArrayIdenticalOrNot(arr1, arr2);

		int[] arr3 = { 10, 12, 55, 32, 17, 99 };
		int[] arr4 = { 10, 12, 55, 32, 17 };
		identicalarray.getArrayIdenticalOrNot(arr3, arr4);
	}
}
