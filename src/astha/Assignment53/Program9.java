/*9. WAP to print below pattern
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5*/


package astha.Assignment53;

public class Program9 {

	public static void main(String[] args) {
		System.out.println("Pattern 9\n");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print(j + " ");
			System.out.println();
		}
	}
}
