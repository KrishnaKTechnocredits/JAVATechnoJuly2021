package mayur.Assignment41;

public class Assignment41 {

	

	void patterprinting(int n) {
		for (int index = 1; index <= n; index++) {
			for (int j = 1; j <= index; j++) {
				if (index % 2 != 0)
					System.out.print("*");
				else
					System.out.print("#");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		Assignment41 assignment41 = new Assignment41();
		assignment41.patterprinting(5);

	}

}
