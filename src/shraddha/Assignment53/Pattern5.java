/*Assignment - 53 : 11th oct'2021 Pattern Printing 
5. WAP to print below pattern
* * * * *
* * * *
* * *
* *
*
*/
package shraddha.Assignment53;

public class Pattern5 {
public static void main(String[] args) {
	int rowCount =5;
	for (int i = 1; i <= rowCount; i++) {
		for (int j = rowCount-i+1; j >= 1; j--) {
			System.out.print(" *");
		}
		System.out.println();
	}
}
}
