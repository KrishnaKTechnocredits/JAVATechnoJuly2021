/*WAP to print below pattern
* * * * *
* * * *
* * *
* *
*
*/
package vivek.Assignment53;

public class Assignment53_05 {

	static void pattern5() {
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Assignment53_05.pattern5();
	}
}
