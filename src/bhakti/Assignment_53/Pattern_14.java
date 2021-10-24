/*
14. WAP to print below pattern
A 
A B 
A B C 
A B C D 
A B C D E 
A B C D E 

*/

package bhakti.Assignment_53;

public class Pattern_14 {
	
	public static void main(String[] args) {
		int n= 65, row=5;
		
	for (int i= 1; i<=row; i++) {
		char ch=65;
		for (int j=i; j>=1; j--) {
			System.out.print(ch++ +" ");
		}
		System.out.println();
	}
		
	}

}
