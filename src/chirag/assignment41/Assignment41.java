package chirag.assignment41;

public class Assignment41 {
	
	void pattern(int row) {
		for(int i = 1; i <=row ; i++) {
			for(int j = 1; j<=i ; j++) {
				if(i % 2 != 0) {
					System.out.print("*" + " ");
				}
				else {
					System.out.print("#" + " ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Assignment41 a= new Assignment41();
		a.pattern(5);
	}

}
