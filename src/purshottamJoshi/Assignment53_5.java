package purshottamJoshi;

public class Assignment53_5 {

	void getPattern5() {
		
		for(int i=1; i<=5; i++) {
			for(int j=5; j>=i; j--) {
				System.out.print("*");
				
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		new Assignment53_5().getPattern5();
		
	}
}
