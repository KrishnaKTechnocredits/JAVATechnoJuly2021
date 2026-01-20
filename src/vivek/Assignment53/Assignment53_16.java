/*WAP to print below pattern
A
ab
ABC
abcd
*/

package vivek.Assignment53;

public class Assignment53_16 {

	static void pattern53_16() {
		char ch1 = 'A';
		char ch2 = 'a';
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % 2 == 0) {
					System.out.print(ch2);
					ch2 = (char) (ch2 + 1);
				} else {
					System.out.print(ch1);
					ch1 = (char) (ch1 + 1);
				}
			}
			System.out.println();
			ch1 = 'A';
			ch2 = 'a';
		}
	}

	public static void main(String[] args) {
		Assignment53_16.pattern53_16();
	}
}
