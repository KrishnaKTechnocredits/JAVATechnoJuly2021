/*Assignment - 53 : 11th oct'2021 Pattern Printing 
11. WAP to print below pattern
5
5 4
5 4 3
5 4 3 2
5 4 3 2 1
*/
package shraddha.Assignment53;

public class Pattern11 {
public static void main(String[] args) {
	int rowCount =5;
	for (int i = 1; i <= rowCount; i++) {
		for (int j = rowCount; j > rowCount-i; j--) {
			System.out.print(" "+j);
		}
		System.out.println();
	}
}
}
