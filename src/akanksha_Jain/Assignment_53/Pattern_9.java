/* Assignment - 53 : 11th oct'2021 Pattern Printing 	
Program 9: WAP to print below pattern				
1
12 
123 
1234 
12345	*/

package akanksha_Jain.Assignment_53;

public class Pattern_9 {
	
	void printPattern(int rows) {
		for(int index=1; index<=rows; index++) {
			int count = 1;
			for(int index2=1; index2<=index; index2++) {
				System.out.print(count + " ");
				count ++;
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Pattern_9 pattern9 = new Pattern_9();
		pattern9.printPattern(5);
	}
}