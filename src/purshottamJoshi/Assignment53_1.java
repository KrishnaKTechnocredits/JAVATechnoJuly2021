package purshottamJoshi;

public class Assignment53_1 {

	void getPattern1() {
		
		for(int i=0; i <=4; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		new Assignment53_1().getPattern1();
	}
}
