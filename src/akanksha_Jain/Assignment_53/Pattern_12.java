/* Assignment - 53 : 11th oct'2021 Pattern Printing 	
Program 12: WAP to print below pattern				
1
21 
321 
4321 
54321	*/

package akanksha_Jain.Assignment_53;

public class Pattern_12 {
	
	void printPattern(int rows) {
		for(int index=1; index<=rows; index++) {
			for(int index2=index; index2>=1; index2--) {
				System.out.print(index2 + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Pattern_12 pattern12 = new Pattern_12();
		pattern12.printPattern(5);
	}
}