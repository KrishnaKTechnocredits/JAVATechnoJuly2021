/*WAP to print below pattern
*
* *
* * *
* * * *
*/

package vivek.Assignment53;

public class Assignment53_01 {

	static void pattern1() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Assignment53_01.pattern1();
	}
}
