package swati.Assignment41;
/*
Assignment-41 : 28th Sep'2021  
Write a code to print below pattern.

*
##
***
####
*****
 */
public class Assignment41 {
	
	/*void printPattern(int n) {
		char ch='*';
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(ch);
			}
			System.out.println();
			if(ch=='*') {
				ch='#';
				}
			else if(ch=='#') {
			   ch='*';
			}
		}
	}
	*/

	void printPattern2(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(i%2==0) {
					System.out.print("#");
				}
				else
					System.out.print("*");
				}
			System.out.println();
			}
	}
	
	public static void main(String[] a) {
		Assignment41 a1=new Assignment41();
		a1.printPattern2(5);
	}
}
