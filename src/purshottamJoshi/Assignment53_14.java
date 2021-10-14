package purshottamJoshi;

public class Assignment53_14 {

	private static void getPattern14() {
		
		for (int i = 0; i <= 5; i++) {
			for (int j = 65; j <= 65 + i; j++)
				System.out.print((char) j);
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		getPattern14();
	}
}
