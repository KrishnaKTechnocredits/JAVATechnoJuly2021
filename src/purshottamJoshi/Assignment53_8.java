package purshottamJoshi;

public class Assignment53_8 {
	
	void getPattern8() {
		for(int i=1; i<=5; i++) {
			for(int j=5; j >i; j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
				
			}
			for(int k=4; k>=i; k--) {
				System.out.print(" *");
			}
			
			System.out.println();
		}
	}
	public static void main(String[] args) {
		new Assignment53_8().getPattern8();
	}

}
