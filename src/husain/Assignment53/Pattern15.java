package husain.Assignment53;

public class Pattern15 {
	static int k = 1;
	static int m = 'A';

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
