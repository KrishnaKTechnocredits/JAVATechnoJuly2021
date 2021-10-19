package swati.Assignment53;

/*
15. WAP to print below pattern
1A2B3C
4D5E6F
7G8H9I

*/

public class Pattern15 {
	static int temp=1;
	static int letter=64;
	static void printPettern(int row,int col) {
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=col;j++) {
				char ch=(char) (letter+temp);
				System.out.print(temp+++""+ch);
			}
		System.out.println();
		}
		
	}
	
	public static void main(String[] a) {
		printPettern(3,3);
	}
}
