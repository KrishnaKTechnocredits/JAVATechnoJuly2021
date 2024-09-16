/*WAP to print below pattern
A
A B
A B C
A B C D
A B C D E
A B C D E F
*/
package vivek.Assignment53;

public class Assignment53_14 {

	static void pattern14() {
		char ch = 'A';
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(ch);
				ch = (char) (ch + 1);
			}
			System.out.println();
			ch = 'A';
		}
	}

	public static void main(String[] args) {
		Assignment53_14.pattern14();
	}
}
