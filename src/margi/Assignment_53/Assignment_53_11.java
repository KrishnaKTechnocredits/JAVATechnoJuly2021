package margi.Assignment_53;

/*WAP to print below pattern
5 
5 4 
5 4 3 
5 4 3 2 
5 4 3 2 1
*/

public class Assignment_53_11 {

	void pattern(int row) {
		for (int i = 1; i <= row; i++) {
			int k = row;
			for (int j = 1; j <= i; j++) {
				System.out.print(k-- + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Assignment_53_11().pattern(5);
	}
}
