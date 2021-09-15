//Assignment27:  WAP to find 2 arrays are identical or not. 
/*int[] arr1 = {10,12,55,32,17};
int[] arr2 = {10,12,55,32,17}};
output : Identical
--------------------------------------------
int[] arr1 = {10,12,55,32,17,99};
int[] arr2 = {10,12,55,32,17}};
output : Not identical
------------------------------------
int[] arr1 = {10,12,55,32,17};
int[] arr2 = {10,12,99,32,17}};
output : Not Identical */

package parthav;

public class CheckIdenticalArrays {

	void checkIdenticalArrays(int[] arr1, int[] arr2) {
		boolean identicalFlag = true;
		if (arr1.length != arr2.length) {
			System.out.println("Array1 and Array2 are not identical");
		} else {
			for (int index = 0; index < arr1.length; index++) {
				if (arr1[index] == arr2[index])
					continue;
				else {
					identicalFlag = false;
					break;
				}

			}
			if (identicalFlag)
				System.out.println("Array1 and Array2 are identical");
			else
				System.out.println("Array1 and Array2 are not identical");
		}
	}

	public static void main(String[] args) {
		CheckIdenticalArrays newObject = new CheckIdenticalArrays();
		int[] arr1 = { 10, 12, 55, 32, 17 };
		int[] arr2 = { 10, 12, 55, 32, 17 };
		newObject.checkIdenticalArrays(arr1, arr2);

		int[] arr3 = { 10, 12, 55, 32, 17, 99 };
		int[] arr4 = { 10, 12, 55, 32, 17 };
		newObject.checkIdenticalArrays(arr3, arr4);

		int[] arr5 = { 10, 12, 55, 32, 17 };
		int[] arr6 = { 10, 12, 99, 32, 17 };
		newObject.checkIdenticalArrays(arr5, arr6);

	}

}
