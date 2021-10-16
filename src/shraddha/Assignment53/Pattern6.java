/*Assignment - 53 : 11th oct'2021 Pattern Printing 
6. WAP to print below pattern
* * * * *
 * * * *
  * * *
   * *
    *
*/
package shraddha.Assignment53;

public class Pattern6 {
public static void main(String[] args) {
	int rowCount =5;
	for (int i = 1; i <= rowCount; i++) {
		for(int j=i;j>=1;j--) {
			System.out.print(" ");
		}
		for(int k=rowCount-i+1;k>=1;k--) {
			System.out.print("* ");
		}
		System.out.println();
	}
}
}
