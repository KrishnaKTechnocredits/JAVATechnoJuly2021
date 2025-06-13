/*WAP to print below pattern
* 
* * 
* * * 
* * * **/

package astha.Assignment53;

public class Program1 {

	public static void main(String[] args) {
		System.out.println("Pattern 16\n");
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
