package husain.Assignment53;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Pattern 7\n");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}
		for (int i = 1; i <= 4; i++) {
			for (int j = 5 - i; j >= 1; j--)
				System.out.print("*");
			System.out.println();
		}
	}

}
