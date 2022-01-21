package neha.assignment_53;
/*
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1 
 */
public class Program12 {
	void diplayPattern(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((i+1)-j+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Program12().diplayPattern(5);
	}
}
