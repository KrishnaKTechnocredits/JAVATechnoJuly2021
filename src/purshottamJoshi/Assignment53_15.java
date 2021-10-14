package purshottamJoshi;

public class Assignment53_15 {
	static int k = 1;
	static int a = 'A';
	static {
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 6; j++) {
				if (j % 2 != 0) {
					System.out.print(k);
					k++;
				} else {
					System.out.print((char) a);
					a++;
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
	}
}
