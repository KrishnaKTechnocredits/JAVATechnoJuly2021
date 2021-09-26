package technocredits1.code_Interview;

public class Q4 {

	public static void main(String[] args) {
		int a[] = { 5, 0, 3, 6, 9, 5, 0, 6, 0, 3, 6 ,6};
		int cnt = 0;
		for (int i = 0; i < a.length; i++) {
			int j;
			for (j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					cnt++;
				}
			}
			if (cnt == 1) {
				System.out.println(a[i]);
			}
			cnt = 0;
		}
	}
}
