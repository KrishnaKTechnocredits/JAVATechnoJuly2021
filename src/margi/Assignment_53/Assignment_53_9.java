package margi.Assignment_53;

/*WAP to print below pattern (pattern 9 & 10 are same)
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5
*/

public class Assignment_53_9 {

	void pattern(int row) {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Assignment_53_9().pattern(5);
	}
}
