/*  1A2B3C
	4D5E6F
	7G8H9I
*/
package monika.Assignment_53;

public class Pattern_15 {
public static void main(String[] args) {
	int k = 1,m = 'A';
	System.out.println("Pattern 15\n");
	for (int i = 1; i <= 3; i++) {
		for (int j = 1; j <= 6; j++) {
			if (j % 2 != 0) {
				System.out.print(k);
				k++;
			} else {
				System.out.print((char) m);
				m++;
			}
		}
		System.out.println();
	}
}
}
