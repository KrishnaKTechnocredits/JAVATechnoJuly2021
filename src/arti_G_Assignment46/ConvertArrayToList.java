package arti_G_Assignment46;

import java.util.ArrayList;
import java.util.List;

/*Example 15:
Write a program to convert Array to List.*/
public class ConvertArrayToList {

	static List<Integer> convertArrayToList(int[] input) {
		List<Integer> list = new ArrayList();
		for (int num : input) {
			list.add(num);
		}
		return list;
	}

	public static void main(String[] args) {
		int[] input = { 19, 12, 18, 17, 23, 22 };
		System.out.println(convertArrayToList(input));
	}

}
