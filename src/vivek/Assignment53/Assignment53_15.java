/*WAP to print below pattern
1A2B3C
4D5E6F
7G8H9I
*/

package vivek.Assignment53;

public class Assignment53_15 {

	static void pattern15() {
		int cnt = 1;
		char ch = 'A';
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 6; j++) {
				if (j % 2 == 0) {
					System.out.print(ch);
					ch = (char) (ch + 1);
				} else {
					System.out.print(cnt);
					cnt++;
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Assignment53_15.pattern15();
	}
}
