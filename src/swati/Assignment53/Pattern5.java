package swati.Assignment53;
/*
5. WAP to print below pattern
* * * * * 
* * * * 
* * * 
* * 
*

*/
public class Pattern5 {

void printPattern(int row) {
		
		for(int i=row;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] a) {
		Pattern5 p5=new Pattern5();
		p5.printPattern(5);
	}
}

