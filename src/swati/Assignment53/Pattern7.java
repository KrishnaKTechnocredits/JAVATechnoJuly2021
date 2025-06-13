package swati.Assignment53;

/*
7. WAP to print below pattern
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

public class Pattern7 {
	
	void printPattern(int row) {
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=row-1;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] a) {
		Pattern7 p7= new Pattern7();
		p7.printPattern(5);
		
	}

}
