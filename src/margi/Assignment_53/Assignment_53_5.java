package margi.Assignment_53;

/*WAP to print below pattern
* * * * * 
* * * * 
* * * 
* * 
*
*/

public class Assignment_53_5 {

	void pattern(int row) {
		for (int i = row; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Assignment_53_5().pattern(5);
	}
}
