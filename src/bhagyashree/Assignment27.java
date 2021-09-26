/*
 * WAP to find 2 arrays are identical or not. 
 */
package bhagyashree;

public class Assignment27 {

	void checkArraysIdentical(int[] array1, int[] array2) {
		boolean flag = false;
		if (array1.length == array2.length) {
			for (int index = 0; index < array1.length; index++) {
				if (array1[index] == array2[index]) {
					flag = true;
				} else {
					flag = false;
					break;
				}
			}
		} else
			flag = false;
		if (flag) {
			System.out.println("Arrays are identical");
		} else {
			System.out.println("Arrays are not identical");
		}

	}

	public static void main(String[] args) {
		int[] arr1 = { 10, 12, 55, 32, 17 };
		int[] arr2 = { 10, 12, 55, 32, 17 };
		Assignment27 assignment27 = new Assignment27();
		assignment27.checkArraysIdentical(arr1, arr2);

		int[] arr3 = { 10, 12, 55, 32, 17 };
		int[] arr4 = { 10, 12, 99, 32, 17 };
		assignment27.checkArraysIdentical(arr3, arr4);

		int[] arr5 = { 10, 12, 55, 32, 17, 99 };
		int[] arr6 = { 10, 12, 55, 32, 17 };
		assignment27.checkArraysIdentical(arr5, arr6);
	}

}
