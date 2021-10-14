/*Assignment - 53 : 11th oct'2021 Pattern Printing 
14. WAP to print below pattern
A
A B
A B C
A B C D
A B C D E
A B C D E F
*/
package shraddha.Assignment53;

public class Pattern14 {
	public static void main(String[] args) {
		int rowCount = 5;
		for (int i = 0; i <= rowCount; i++) {
			for (int j = 65; j <= 65 + i; j++) {
				System.out.print((char) j + (" "));
			}
			System.out.println();
		}
	}
}
