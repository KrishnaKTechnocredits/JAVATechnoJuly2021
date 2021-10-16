/*1. WAP to print below pattern
* 
* * 
* * * 
* * * * 
*/
package shalaka.Assignment53;

public class Pattern1 {
	private static void pattren1() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattren1();
	}

}
