/*Assignment - 53 : 11th oct'2021 Pattern Printing 
1. WAP to print below pattern
* 
* * 
* * * 
* * * *

*/
package shraddha.Assignment53;

public class Pattern1 {
	public static void main(String[] args) {
		int rowCount = 4;
		for (int i = 1; i <= rowCount; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}
