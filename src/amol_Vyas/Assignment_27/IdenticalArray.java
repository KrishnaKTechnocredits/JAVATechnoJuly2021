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

package amol_Vyas.Assignment_27;

public class IdenticalArray {

	void checkIdenticalArray(int[] input1, int[] input2) {
		boolean flag = false;
		if (input1.length == input2.length) {
			for (int index = 0; index < input1.length; index++) {
				if (input1[index] == input2[index]) {
					flag = true;
				} else {
					flag = false;
					break;
				}
			}
		} else
			flag = false;

		if (flag)
			System.out.println("Both arrays are identical");
		else
			System.out.println("Both arrays are not identical");
	}

	public static void main(String[] args) {
		int[] input1 = { 10, 12, 55, 32, 17 };
		int[] input2 = { 10, 12, 55, 32, 17 };
		IdenticalArray identicalArray = new IdenticalArray();
		identicalArray.checkIdenticalArray(input1, input2);
		int[] arr1 = { 10, 12, 55, 32, 17, 99 };
		int[] arr2 = { 10, 12, 55, 32, 17 };
		identicalArray.checkIdenticalArray(arr1, arr2);
		int[] arr3 = { 10, 12, 55, 32, 17 };
		int[] arr4 = { 10, 12, 99, 32, 17 };
		identicalArray.checkIdenticalArray(arr3, arr4);

	}

}
