package purshottamJoshi;

public class Assignment53_4 {

	void getPattern4() {
		for(int i=1; i<=9; i++) {
			if(i%2 !=0) {
				for(int j=3; j >=i; j--) {
				System.out.print(" ");
				}
				for(int k=1;k<=i;k++) {
				System.out.print("*");
			
				}
			System.out.println();
			}
		}
		for(int i=1; i<=9;i++) {
			if(i % 2 ==0) {
				for(int j=9; j>i ;j--) {
					System.out.print("*");
				}
				System.out.println();
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		new Assignment53_4().getPattern4();
	}
}
