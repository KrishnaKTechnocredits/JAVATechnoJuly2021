/*15. WAP to print below pattern
1A2B3C
4D5E6F
7G8H9I*/
package shalaka.Assignment53;

public class Pattern15 {
	static int num = 1;
	static char ch = 'A';

	static void pattern15(int row) {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= 6; j++) {
				if (j % 2 == 1)
					System.out.print(num++);
				else
					System.out.print(ch++);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern15(3);
	}

}
