package purshottamJoshi;

public class Assignment53_16 {

	 static {
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
	public static void main(String[] args) {
		
	}
}
