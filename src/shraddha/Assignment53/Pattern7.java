/*Assignment - 53 : 11th oct'2021 Pattern Printing 
7. WAP to print below pattern
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
package shraddha.Assignment53;

public class Pattern7 {
	public static void main(String[] args) {
		int rowCount = 5;
		// upper part
		for (int i = 1; i <= rowCount; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		// lower part
		for (int i = 1; i <= rowCount; i++) {
			for (int j = rowCount - i; j >= 1; j--) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
