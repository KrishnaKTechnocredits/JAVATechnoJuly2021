/*Assignment-41 : 28th Sep'2021  
Write a code to print below pattern.

*
##
***
####
******/

package bhakti;

public class Assignment_41_pattern {
	void printPattern(int n) {
		for (int i=1; i<= n; i++) {
			if (i%2!=0) {
				int y=0;
				while (y<i) {
					System.out.print("*");
					y++;
				}
			}else {
				int y=0;
				while (y<i) {
					System.out.print("#");
					y++;
				}
				
			}	
			System.out.println("");
		}
		System.out.println("-----------");
	}
	public static void main(String[] args) {
		Assignment_41_pattern a= new Assignment_41_pattern();
		a.printPattern(5);
		a.printPattern(10);
	}
}
