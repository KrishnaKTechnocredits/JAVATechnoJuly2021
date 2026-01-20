/*WAP to print below pattern
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
*/

package vivek.Assignment53;

public class Assignment53_10 {

	static void pattern10() {
		int cnt = 1;// as pattern started from 1
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(cnt + " ");
				cnt++;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Assignment53_10.pattern10();
	}
}
