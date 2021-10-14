/* Assignment - 53 : 11th oct'2021 Pattern Printing 	
Program 14: WAP to print below pattern				
A
AB
ABC 
ABCD
ABCDE
ABCDEF	*/

package akanksha_Jain.Assignment_53;

public class Pattern_14 {
	
	void printPattern(int rows) {
		for(int index=1; index<=rows; index++) {
			char ch = 'A';
			for(int index2=1; index2<=index; index2++) {
				System.out.print(ch);
				ch = (char) (ch + 1);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Pattern_14 pattern14 = new Pattern_14();
		pattern14.printPattern(6);
	}
}