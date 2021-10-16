package margi.Assignment_53;

/*WAP to print below pattern
1A2B3C
4D5E6F
7G8H9I
*/

public class Assignment_53_15 {

	void pattern(int row, int col) {
		int countNum = 1, countAlpha = 65;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= col; j++) {
				if (j % 2 == 0)
					System.out.print((char) countAlpha++);
				else
					System.out.print(countNum++);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Assignment_53_15().pattern(3, 6);
	}
}
