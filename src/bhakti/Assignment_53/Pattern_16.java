/*
16. WAP to print below pattern
A
ab
ABC
abc*/

package bhakti.Assignment_53;

public class Pattern_16 {

	public static void main(String[] args) {
		
		int row = 4;
		for (int i = 1; i <= row; i++) {
			char captile = 65, small = 97;
			if (i % 2 != 0) {
				for (int j = i; j >= 1; j--) {
					System.out.print(captile++);
				}

			}else {
				for (int j = i; j >= 1; j--) {
					System.out.print(small++);
				}
			}
			System.out.println();
		}
		
	}

}
