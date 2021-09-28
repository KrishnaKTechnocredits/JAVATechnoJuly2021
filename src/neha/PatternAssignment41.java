package neha;

/* *
   ##
   ***
   ####
   ******/
public class PatternAssignment41 {
	void printPattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % 2 == 0)
					System.out.print("#");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		PatternAssignment41 patternAssignment41 = new PatternAssignment41();
		int nPatternRows = 5;
		patternAssignment41.printPattern(nPatternRows);

	}
}
