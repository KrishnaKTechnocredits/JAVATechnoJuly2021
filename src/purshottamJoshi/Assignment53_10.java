package purshottamJoshi;

public class Assignment53_10 {

	void getPattern10() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		new Assignment53_10().getPattern10();
	}
}
