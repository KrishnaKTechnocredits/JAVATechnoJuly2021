/*11. WAP to print below pattern
5 
5 4 
5 4 3 
5 4 3 2 
5 4 3 2 1*/


package astha.Assignment53;

public class Program11 {

	public static void main(String[] args) {
		System.out.println("Pattern 11\n");
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= 6 - i; j--)
				System.out.print(j + " ");
			System.out.println();
		}
	}
}
