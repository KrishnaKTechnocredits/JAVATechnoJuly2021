//program 3 : print difference between max and min number from given array.
package atul_K.Assignments.Ass14;

public class Program3 {

	void diff(int[] arr) {
		int max = arr[0], min= arr[0];
		for (int index =0; index < arr.length; index++) {
			if (max < arr[index])
				max = arr[index];
			if (min>arr[index])
				min = arr[index];
		}
		System.out.println(max-min);
	}
	public static void main (String[] args) {
		int[] arr = {1,11,44,23,55,99,23};
		Program3 p3 = new Program3();
		p3.diff(arr);
	}
}
