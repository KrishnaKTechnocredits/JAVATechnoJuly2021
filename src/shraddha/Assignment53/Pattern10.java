/*Assignment - 53 : 11th oct'2021 Pattern Printing 
10. WAP to print below pattern
    1
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5

*/
package shraddha.Assignment53;

public class Pattern10 {
public static void main(String[] args) {
	int rowCount =5;
	for (int i = 1; i <= rowCount; i++) {
		for(int k = rowCount; k > i;k--) {
			System.out.print(" ");
		}
		for (int j = 1; j <= i; j++) {
			System.out.print(" "+j);
		}
		System.out.println();
	}
}
}
