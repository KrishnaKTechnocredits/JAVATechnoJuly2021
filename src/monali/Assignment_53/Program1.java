package monali.Assignment_53;
/*1. WAP to print below pattern
*
* *
* * *
* * * *   */
public class Program1 {

	public static void main(String[] args) {
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*"+ " ");
			}
			System.out.println();
		}
		
	}
}
