//program 2 : find minimum number from given array
package atul_K.Assignments.Ass14;

public class Program2 {
	void minnum(int [] arr) {
		int min =arr[0];
		for (int index =0; index < arr.length; index++) {
			if (min > arr[index])
				min = arr[index];
		}
		System.out.println(min);
	}
	public static void main(String [] args) {
		int[] arr = {87,83,2,68,99,8};
		Program2 p1 = new Program2();
		p1.minnum(arr);
	}
	
	
}
