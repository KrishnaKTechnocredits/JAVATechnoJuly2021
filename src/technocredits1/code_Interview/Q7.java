package technocredits1.code_Interview;

import java.util.Arrays;

public class Q7 {

	public static void main(String[] args) {
		int a[] = { 5, 2, 3, 6, 4, 0 };
		for (int i = 1; i <= 3; i++) {
			shiftArrayByOne(a);
		}
		System.out.println(Arrays.toString(a));
	}

	static void shiftArrayByOne(int a[]) {
		int last = a[0];
		for (int i = 0; i < a.length - 1; i++) {
			a[i] = a[i + 1];
		}
		a[a.length - 1] = last;
	}
}
