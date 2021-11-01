package neha.assignment_53;
//patterns 9 and 10 are same and logic is as below
/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5	
 */
public class Program9 {
	void diplayPattern(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Program9().diplayPattern(5);
	}
}
