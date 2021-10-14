/*Assignment - 53 : 11th oct'2021 Pattern Printing 
8. WAP to print below pattern
     *
    **
    ***
   ****
   *****
   ****
    ***
    **
     *
*/
package shraddha.Assignment53;

public class Pattern8 {
public static void main(String[] args) {
	int rowCount = 5;
	//upper part
	for (int i = 1; i <= rowCount; i++) {
		for(int k = rowCount; k > i;k--) {
			System.out.print(" ");
		}
		for (int j = 1; j <= i; j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	//lower part
	for (int i = rowCount - 1; i >= 1; i--) {
		for (int j = 1; j <= rowCount - i; j++) {
			System.out.print(" ");
		}
		for (int k = 1; k <= i; k++) {
			System.out.print("* ");
		} 
		System.out.println();
	}
}
}
