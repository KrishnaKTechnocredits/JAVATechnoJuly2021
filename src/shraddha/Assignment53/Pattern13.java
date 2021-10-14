/*Assignment - 53 : 11th oct'2021 Pattern Printing 
13. WAP to print below pattern
10101
01010
10101
01010
10101
*/
package shraddha.Assignment53;

public class Pattern13 {
	public static void main(String[] args) {
		int cnt = 0;
		for (int i = 1; i <= 5; i++) {
			if (i % 2 != 0)
				cnt = 1;
			else
				cnt = 0;
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
}
