/*Assignment - 53 : 11th oct'2021 Pattern Printing 
15. WAP to print below pattern
1A2B3C
4D5E6F
7G8H9I
*/
package shraddha.Assignment53;

public class Pattern15 {
	public static void main(String[] args) {
		int cnt = 1, letter = 'A';
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 6; j++) {
				if (j % 2 == 0) {
					System.out.print((char) letter++);
				} else
					System.out.print(cnt++);
			}
			System.out.println();
		}
	}
}
