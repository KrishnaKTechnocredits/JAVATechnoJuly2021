package swati.Assignment53;

/*
6. WAP to print below pattern
* * * * * 
* * * * 
 * * * 
  * * 
   *

*/

public class Pattern6 {
	void printPattern(int row) {
		for(int i=row;i>=1;i--) {
			for(int k=0;k<row-i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] a) {
		Pattern6 p6=new Pattern6();
		p6.printPattern(5);
		
	}
}
	
