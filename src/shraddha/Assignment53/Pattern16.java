/*Assignment - 53 : 11th oct'2021 Pattern Printing 
16. WAP to print below pattern
A
ab
ABC
abcd
*/
package shraddha.Assignment53;

public class Pattern16 {
	public static void main(String[] args) {
		int rowCount = 4;
		for (int i = 0; i < rowCount; i++) {
			for (int j = 65; j <= 65 + i; j++) {
				if (i % 2 != 0)
					System.out.print((char) (j + 32));
				else
					System.out.print((char) j);
			}
			System.out.println();
		}
	}
}
