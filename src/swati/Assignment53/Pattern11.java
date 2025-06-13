package swati.Assignment53;

/*
/*WAP to print below pattern
5 
5 4 
5 4 3 
5 4 3 2 
5 4 3 2 1 
*/
public class Pattern11 {
	
	void printPattern(int row) {
		for(int i=1;i<=row;i++) {
			int temp=row;
			for(int j=1;j<=i;j++) {
				System.out.print(temp+" ");
				temp--;
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] a) {
		Pattern11 p2=new Pattern11();
		p2.printPattern(5);
	}

}
