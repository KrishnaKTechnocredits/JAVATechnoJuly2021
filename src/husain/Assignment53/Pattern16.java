package husain.Assignment53;

public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Pattern 16\n");
		for (int i = 0; i <= 3; i++) {
			for (int j = 65; j <= 65 + i; j++) {
				if (i % 2 != 0)
					System.out.print((char) (j + 32));
				else
					System.out.print((char) j);
			}
			System.out.println();
		}
	}

}
