package swati.Assignment53;

/*
12. WAP to print below pattern
1 
2 1 
3 2 1 
4 3 2 1 
5 4 3 2 1


*/

public class Pattern12 {

	void printPattern(int row) {
		
		for(int i=1;i<=row;i++) {
			for(int j=i;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}		
	}
	
	public static void main(String[] a) {
		Pattern12 p12=new Pattern12();
		p12.printPattern(5);
		
	}
}