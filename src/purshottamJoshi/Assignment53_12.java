package purshottamJoshi;

public class Assignment53_12 {

	private static void getPattern12() {
		int count=1;
		for(int i=1; i<=5; i++) {
			for(int j=i; j >=1 ; j--) {
				System.out.print(j);
		
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		getPattern12();
	}
}

