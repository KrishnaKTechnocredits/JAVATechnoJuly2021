/* WAP to find 2 arrays are identical or not.
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
package shalaka.Assignment27;

public class FindIdenticalArray {
	boolean isIdentical = false;

	void isTwoArraysIdentical(int[] arr1, int[] arr2) {
		for (int index = 0; index < arr1.length; index++) {
			if (arr1.length != arr2.length) {
				isIdentical = false;
			}
			if (arr1[index] == arr2[index]) {
				continue;
			}
			else
				if(isIdentical=true)
			break;
			}
			if(isIdentical)
				System.out.println("Both Arrays are not Identicals");
			else
				System.out.println("Both Arrays are Identicals");
		}

	public static void main(String[] args) {
		int[] arr1 = { 10, 12, 55, 32, 17 };
		int[] arr2 = { 10, 12, 55, 32, 17 };
		int[] arr3 = { 10, 12, 55, 32, 18 };
		int[] arr4 = { 10, 12, 99, 32, 17};
		FindIdenticalArray findIdenticalArray = new FindIdenticalArray();
		findIdenticalArray.isTwoArraysIdentical(arr1, arr2);
		findIdenticalArray.isTwoArraysIdentical(arr3, arr4);
	}

}
