/* Assignment - 53 : 11th oct'2021 Pattern Printing 	
Program 13: WAP to print below pattern				
10101
01010
10101
01010
10101	*/

package akanksha_Jain.Assignment_53;

public class Pattern_13 {
	
	void printPattern(int rows, int columns) {
		int cnt = 0;
		for(int index=1; index<=rows; index++) {
			if(index%2 != 0) {
				cnt = 1;
			}
			else {
				cnt = 0;
			}
			for(int index2=1; index2<=columns; index2++) {
				System.out.print(cnt + " ");
				if(cnt == 1) {
					cnt = 0;
				}
				else {
					cnt = 1;
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Pattern_13 pattern13 = new Pattern_13();
		pattern13.printPattern(5, 5);
	}
}