/*11. WAP to print below pattern
5 
5 4 
5 4 3 
5 4 3 2 
5 4 3 2 1
*/
package shalaka.Assignment53;

public class Pattern11 {
	static void pattern11(int row) {
		for (int i = 1; i <= row; i++) {
			int cnt=row;
			for (int j =1; j<=i; j++) {
				System.out.print(cnt + " ");
				cnt--;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern11(5);
	}

}
