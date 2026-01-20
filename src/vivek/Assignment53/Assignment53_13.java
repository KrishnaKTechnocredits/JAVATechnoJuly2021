/*WAP to print below pattern
10101
01010
10101
01010
10101
*/
package vivek.Assignment53;

public class Assignment53_13 {

	static void pattern13() {
		int cnt = 0;
		for (int i = 1; i <= 5; i++) {
			if (i % 2 == 0)
				cnt = 0;
			else
				cnt = 1;
			for (int j = 1; j <= 5; j++) {
				System.out.print(cnt);
				if (cnt == 1)
					cnt = 0;
				else
					cnt = 1;

			}
			System.out.println();
		}
	}

	static void pattern13Alternative() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i % 2 == 0) {
					if (j % 2 == 0)
						System.out.print(1);
					else
						System.out.print(0);
				} else {
					if (j % 2 == 0)
						System.out.print(0);
					else
						System.out.print(1);
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Assignment53_13.pattern13();
	}
}
