/*Example 15:
Write a program to convert Array to List.*/
package shalaka.Assignment46;

import java.util.ArrayList;

public class Program15 {
	void convertArrayToList(int[] arr) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int index = 0; index < arr.length; index++) {
			list.add(arr[index]);
		}
		System.out.println("After converting Array to ArrayList: " + list);
	}

	public static void main(String[] args) {
		Program15 program15 = new Program15();
		int[] arr = { 10, 20, 30, 40, 50, 60 };
		program15.convertArrayToList(arr);
	}
}
