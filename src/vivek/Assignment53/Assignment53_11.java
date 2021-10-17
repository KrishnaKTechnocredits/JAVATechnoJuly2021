/*WAP to print below pattern
5
5 4
5 4 3
5 4 3 2
5 4 3 2 1
*/

package vivek.Assignment53;

public class Assignment53_11 {

	static void pattern53() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= 6 - i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Assignment53_11.pattern53();
	}
}
