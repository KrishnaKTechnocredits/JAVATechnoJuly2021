/*      1 
		1 2 
		1 2 3 
		1 2 3 4 
		1 2 3 4 5
 */
 package monika.Assignment_53;

public class Pattern_9 {
	public static void main(String[] args) {
		System.out.println("Pattern 9");
		for(int i=1;i<=5; i++) {
			for(int j=1;j<=i; j++)
				System.out.print(j+" ");
			System.out.println();
		}
			
	}

}
