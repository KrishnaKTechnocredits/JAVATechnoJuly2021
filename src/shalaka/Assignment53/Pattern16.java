/*16. WAP to print below pattern
A
ab
ABC
abcd*/
package shalaka.Assignment53;

public class Pattern16 {
	static void pattern16(int row) {
		for (int i = 1; i <= row; i++) {
			char ch;
			if (i % 2 == 0)
				ch = 'a';
			else
				ch = 'A';
			for (int j = 1; j <= i; j++) {
				System.out.print(ch++);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern16(4);
	}

}
