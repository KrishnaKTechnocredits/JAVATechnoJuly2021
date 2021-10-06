package manaswi;
public class Assignment_41 {

	void pattern(int n) {

         for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				if(i%2 == 0) {
					System.out.print("*");
				}
				else {
					System.out.print("#");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Assignment_41 ass_41 = new Assignment_41();
		ass_41.pattern(5);


	}

}