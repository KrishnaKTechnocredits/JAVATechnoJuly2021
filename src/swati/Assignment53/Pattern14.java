package swati.Assignment53;

/*
14. WAP to print below pattern
A 
A B 
A B C 
A B C D 
A B C D E 
A B C D E F
*/

public class Pattern14 {
	
	void printPettern(int row) {
		int letter=64;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				char ch=(char) (letter+j);
				System.out.print(ch+" ");
			}
		System.out.println();
		}
		
	}
	
	public static void main(String[] a) {
		Pattern14 p14=new Pattern14();
		p14.printPettern(6);
	}

}
