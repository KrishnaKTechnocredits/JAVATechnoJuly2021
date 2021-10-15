package monali.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Example 15:
Write a program to convert Array to List.*/

public class Program14 {

	void convertArrayToList(Integer[] arr) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));

		System.out.println("Convert array to List : " + list);
	}

	public static void main(String[] args) {
		Integer[] arr = { 90, 20, 30, 40, 50 };
		Program14 p14 = new Program14();
		p14.convertArrayToList(arr);
	}
}
