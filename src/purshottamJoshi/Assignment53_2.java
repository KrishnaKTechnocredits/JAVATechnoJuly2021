package purshottamJoshi;

public class Assignment53_2 {

	void getPattern2() {
		for(int i=1; i<=4; i++) {
			for(int j=3; j >=i; j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		new Assignment53_2().getPattern2();
	}
}
