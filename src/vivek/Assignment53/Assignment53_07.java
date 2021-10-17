/*WAP to print below pattern
*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*
*/

package vivek.Assignment53;

public class Assignment53_07 {

	static void pattern7() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 4; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Assignment53_07.pattern7();
	}
}
