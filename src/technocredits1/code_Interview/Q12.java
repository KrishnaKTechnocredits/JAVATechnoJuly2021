package technocredits1.code_Interview;

import java.util.Arrays;

public class Q12 {

	public static void main(String[] args) {
		int array[] = { 2, 44, 67, 55, 95, 2, 4 };
		int num[] = new int[2];
		int max = 0;
		for (int i = 1; i < array.length; i++) {
			if (max < array[i] + array[i - 1]) {
				max = array[i] + array[i - 1];
				num[0] = array[i - 1];
				num[1] = array[i];
			}
		}
		System.out.println(max);
		System.out.println(Arrays.toString(num));
	}
}
