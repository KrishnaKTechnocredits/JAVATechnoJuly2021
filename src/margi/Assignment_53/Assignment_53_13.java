package margi.Assignment_53;

/*WAP to print below pattern
10101
01010
10101
01010
10101
*/

public class Assignment_53_13 {

	void pattern(int row, int col) {
		int count;
		for (int i = 1; i <= row; i++) {
			if (i % 2 == 0)
				count = 0;
			else
				count = 1;
			for (int j = 1; j <= col; j++) {
				System.out.print(count);
				if (count == 0)
					count = 1;
				else
					count = 0;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Assignment_53_13().pattern(5, 5);
	}
}
