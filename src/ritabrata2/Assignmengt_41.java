/*Assignment-41 : 28th Sep'2021  
Write a code to print below pattern.

*
##
***
####
*****
*/


package ritabrata2;

public class Assignmengt_41 {
	
	void printCharecters(int limit) {
		for(int i=0;i<=limit;i++) {
			for(int j=1; j<=i;j++){
				if(i%2==0) 
					System.out.print("# ");
				
				else
					System.out.print("* ");
			}
			System.out.println(" ");
			
		}
	}

	public static void main(String[] args) {
		Assignmengt_41 pattern = new Assignmengt_41();
		pattern.printCharecters(5);

	}

}
