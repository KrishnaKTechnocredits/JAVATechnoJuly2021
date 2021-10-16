package margi.Assignment_53;

/*WAP to print below pattern
1 
2 1 
3 2 1 
4 3 2 1 
5 4 3 2 1
*/

public class Assignment_53_12 {

	void pattern(int row) {
		for (int i = 1; i <= row; i++) {
			int k = i;
			for (int j = 1; j <= i; j++) {
				System.out.print(k-- + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Assignment_53_12().pattern(5);
	}
}
