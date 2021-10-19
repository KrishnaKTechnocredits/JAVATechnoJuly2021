package swati.Assignment53;
/*
 * 3. WAP to print below pattern
 
 		* 
      * * 
    * * * 
  * * * * 
* * * * *

 */

public class Pattern3 {
	
	void printPattern(int row) {
		for(int i=1;i<=row;i++) {
			
			for(int k=1;k<=row-i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] a) {
		Pattern3 p3=new Pattern3();
		p3.printPattern(5);
	}

}
