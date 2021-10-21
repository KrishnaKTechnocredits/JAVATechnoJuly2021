/*
 
 12. WAP to print below pattern
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1
 
 
 */


package harshada.Assignment_53;

public class P12 {
	
	
	static void print() {
		for(int i=1; i<=5; i++) {
			for(int j=i; j>=1; j--) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P12.print();
	}

}
