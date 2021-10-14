package purshottamJoshi;

public class Assignment53_3 {

	void getPattern3() {
		
		for(int i=1; i<=4; i++) {
			for(int j=4; j >i; j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		new Assignment53_3().getPattern3();
	}
}
