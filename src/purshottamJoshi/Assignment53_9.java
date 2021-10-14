/*1
1 2
1 2 3
1 2 3 4
1 2 3 4 5*/
package purshottamJoshi;

public class Assignment53_9 {

	void getPattern9() {

		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		new Assignment53_9().getPattern9();
	}
}
