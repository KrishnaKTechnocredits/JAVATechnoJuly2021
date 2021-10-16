/*Assignment - 53 : 11th oct'2021 Pattern Printing 
12. WAP to print below pattern
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1
*/
package shraddha.Assignment53;

public class Pattern12 {
public static void main(String[] args) {
	int rowCount =5;
	for (int i = 1; i <= rowCount; i++) {
		for (int j = i; j >= 1; j--) {
			System.out.print(" "+j);
		}
		System.out.println();
	}
}
}
