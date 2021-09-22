package technocredits1.code_Interview;

public class Q20 {

	public static void main(String[] args) {
		int a[] = { 2, 5, 6, 8 };
		int b[] = { 6, 2, 8, 5 };
		int aSum = 0;
		int bSum = 0;
		for (int i = 0; i < a.length; i++) {
			char a_ch[] = Integer.toString(a[i]).toCharArray();
			char b_ch[] = Integer.toString(b[i]).toCharArray();
			aSum += (int) a_ch[0];
			bSum += (int) b_ch[0];
		}
		System.out.println(aSum);
		System.out.println(bSum);
		// boolean flag = true;
		// if (a.length == b.length) {
		// Arrays.sort(a);
		// Arrays.sort(b);
		// for (int i = 0; i < a.length; i++) {
		// if (a[i] != b[i])
		// flag = false;
		// }
		// }
		// if (flag)
		// System.out.println("Identical");
	}
}
