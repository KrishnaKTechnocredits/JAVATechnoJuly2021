/* Assignment - 53 : 11th oct'2021 Pattern Printing 	
Program 15: WAP to print below pattern				
1A2B3C 
4D5E6F 
7G8H9I	*/

package akanksha_Jain.Assignment_53;

public class Pattern_15 {
	
	void printPattern(int rows, int columns) {
		int cnt = 1;
		int alphabet = 65;
		for(int index=1; index<=rows; index++) {
			for(int index2=1; index2<=rows; index2++) {
				System.out.print(cnt);
				System.out.print((char)(alphabet + cnt));
				cnt ++;
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Pattern_15 pattern15 = new Pattern_15();
		pattern15.printPattern(3, 6);
	}
}