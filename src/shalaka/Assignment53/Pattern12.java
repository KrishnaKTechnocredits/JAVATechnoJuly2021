/*12. WAP to print below pattern
1 
2 1 
3 2 1 
4 3 2 1 
5 4 3 2 1
*/
package shalaka.Assignment53;

public class Pattern12 {
	static void pattern12(int row) {
		for (int i = 1; i <= row; i++) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern12(5);
	}

}
