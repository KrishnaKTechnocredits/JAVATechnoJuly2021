////program 2 : find maximum number from given array
package atul_K.Assignments.Ass14;

public class Program1 {
	void maxnum(int [] arr) {
		int max =0;
		for (int index =0; index < arr.length; index++) {
			if (max < arr[index])
				max = arr[index];
		}
		System.out.println(max);
	}
	public static void main(String [] args) {
		int[] arr = {87,83,100,68,99,1};
		Program1 p1 = new Program1();
		p1.maxnum(arr);
	}
	
	
}
