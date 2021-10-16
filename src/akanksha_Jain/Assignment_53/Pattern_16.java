/* Assignment - 53 : 11th oct'2021 Pattern Printing 	
Program 16: WAP to print below pattern					
A
ab 
ABC 
abcd	*/

package akanksha_Jain.Assignment_53;

public class Pattern_16 {
	                                                                                                                                                                                                                                                                                                                                   
	void printPattern(int rows) {
		int uppercase = 64;
		int lowercase = 96;
		for(int index=1; index<=rows; index++) {
			for(int index2=1; index2<=index; index2++) {
				if(index%2 != 0)
					System.out.print((char)(uppercase + index2));
				else
					System.out.print((char)(lowercase + index2));
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Pattern_16 pattern16 = new Pattern_16();
		pattern16.printPattern(4);
	}
}