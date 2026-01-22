package shantanu.collectionFramework_assignment48;

import java.util.ArrayList;
import java.util.Arrays;

public class Program10 {
	public static void main(String[] args) {
		Integer[] input = { 1, 2, 3, 5, 4, 7 };
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(input));
		for (int index = 0; index < list.size() - 2; index++) {
			if (list.get(index) + 1 == list.get(index + 1) && list.get(index) + 2 == list.get(index + 2)) {
				list.add(index + 3, 0);
			}
		}
		System.out.println(list);
	}
}
