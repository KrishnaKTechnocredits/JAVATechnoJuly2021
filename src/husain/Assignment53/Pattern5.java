package husain.Assignment53;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Pattern 5\n");
		for (int i = 1; i <= 5; i++) {
			for (int j = 6 - i; j >= 1; j--)
				System.out.print("*");
			System.out.println();
		}
	}

}
