package swati.Assignment53;

/*
 * 9. WAP to print below pattern
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5
 */

public class Pattern9 {

	void printPattern(int row) {
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}		
	}
	
	public static void main(String[] a) {
		Pattern9 p9=new Pattern9();
		p9.printPattern(5);
		
	}
}
