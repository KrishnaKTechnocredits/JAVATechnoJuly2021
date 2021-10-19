package swati.Assignment53;

/*
13. WAP to print below pattern
10101
01010
10101
01010
10101

*/
public class Pattern13 {

	void printPattern(int row,int col) {
		int temp;
		for(int i=1;i<=row;i++) {
			if(i % 2==0) {
				temp=0;
			}else {
				temp=1;
			}
			for(int j=1;j<=col;j++) {
				System.out.print(temp);
				if(temp==0) {
					temp=1;
				}else {
					temp=0;
				}
			}
			System.out.println();
		}		
	}
	
	public static void main(String[] a) {
		Pattern13 p13=new Pattern13();
		p13.printPattern(5,5);
		
	}
}
