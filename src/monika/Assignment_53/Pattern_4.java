/*  Pattern 4
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *

 */

package monika.Assignment_53;

public class Pattern_4 {

	public static void main(String[] args) {
		int n = 5;
        int cnt = n - 1;
        System.out.println("Pattern 4");
        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= cnt; i++)
                System.out.print(" ");
            cnt--;
            for (int i = 1; i <= 2 * k - 1; i++)
                System.out.print("*");
            System.out.println();
        }
        cnt = 1;
        for (int k = 1; k <= n - 1; k++) {
            for (int i = 1; i <= cnt; i++)
                System.out.print(" ");
            cnt++;
            for (int i = 1; i <= 2 * (n - k) - 1; i++)
                System.out.print("*");
            System.out.println();
        }
	}
}
