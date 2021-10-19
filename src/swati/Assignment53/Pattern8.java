package swati.Assignment53;

/*
8. WAP to print below pattern
	* 
 * * 
* * * 
* * * * 
* * * * * 
* * * * 
* * * 
 * * 
  * 


*/
public class Pattern8 {
	void printPattern(int row) {
		
		for(int i=1;i<=row;i++) {
			for(int k=0;k<=row-i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=row-1;i>=1;i--) {
			
			for(int k=0;k<=row-i;k++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] a) {
		Pattern8 p8=new Pattern8();
		p8.printPattern(5);
	}

}
