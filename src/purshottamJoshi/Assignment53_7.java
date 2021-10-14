package purshottamJoshi;

public class Assignment53_7 {
	
	void getPattern7() {
		for(int i=0; i <=4; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0; i <=4; i++) {
			for(int j=4; j >i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}
	public static void main(String[] args) {
		new Assignment53_7().getPattern7();
	}

}
