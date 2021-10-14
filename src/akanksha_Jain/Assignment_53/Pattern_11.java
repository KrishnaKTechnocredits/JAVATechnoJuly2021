/* Assignment - 53 : 11th oct'2021 Pattern Printing 	
Program 11: WAP to print below pattern				
5
54 
543 
5432 
54321	*/

package akanksha_Jain.Assignment_53;

public class Pattern_11 {
	
	void printPattern(int rows) {
		for(int index=1; index<=rows; index++) {
			int count = rows;
			for(int index2=1; index2<=index; index2++) {
				System.out.print(count + " ");
				count --;
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Pattern_11 pattern11 = new Pattern_11();
		pattern11.printPattern(5);
	}
}