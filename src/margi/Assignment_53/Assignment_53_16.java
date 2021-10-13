package margi.Assignment_53;

/*WAP to print below pattern
A
ab
ABC
abcd*/

public class Assignment_53_16 {

	void pattern(int row) {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % 2 == 0)
					System.out.print((char) (j + 96));
				else
					System.out.print((char) (j + 64));
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Assignment_53_16().pattern(4);
	}
}
