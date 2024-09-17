package swati.Assignment53;

/*
/*WAP to print below pattern 
* 
* * 
* * * 
* * * *

*/
public class Pattern1 {

	void printPattern(int row) {
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] a) {
		Pattern1 p1=new Pattern1();
		p1.printPattern(4);
	}
}
