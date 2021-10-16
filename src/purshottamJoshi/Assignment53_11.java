package purshottamJoshi;

public class Assignment53_11 {
	
	private static void getPattern11() {
		for(int i=5; i >=1; i--) {
			for(int j=5; j>=i; j--  ) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
	
		getPattern11();
	}

}
