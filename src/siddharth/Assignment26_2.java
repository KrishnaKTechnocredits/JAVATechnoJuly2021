package siddharth;

import java.util.Arrays;

public class Assignment26_2 {
	String[] reverseArray(String[] arr) {
		String[] outputArray = new String[arr.length];
		for (int index = 0; index < arr.length; index++) {
			outputArray[index] = arr[arr.length - index - 1];
		}
		return outputArray;
	}

	public static void main(String[] args) {
		Assignment26_2 assignment26_2 = new Assignment26_2();
		String[] arr = { "Credits", "Techno", "From", "Diwali", "Happy" };
		System.out.println(Arrays.toString(assignment26_2.reverseArray(arr)));
	}
}
