package swati.Assignment53;

/*
16. WAP to print below pattern
A
ab
ABC
abcd

*/

public class Pattern16 {
	void printPettern(int row) {
		int letter=64;
		int count;
		for(int i=1;i<=row;i++) {
			if(i%2==0) {
				 letter=96;
			}else
				letter=64;
			
			for(int j=1;j<=i;j++) {
				char ch=(char) (letter+j);
				System.out.print(ch+" ");
			}
		System.out.println();
		}
		
	}
	
	public static void main(String[] a) {
		Pattern16 p16=new Pattern16();
		p16.printPettern(4);
	}
}
