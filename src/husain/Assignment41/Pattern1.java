package husain.Assignment41;

public class Pattern1 {
	
	void printPattern(int row) {
		
		for(int i = 1; i <=row; i++) {
			for(int j = 1; j<=i;j++) {
				if(i%2!=0)
					System.out.print("*");
				else
					System.out.print("#");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern1 obj = new Pattern1();
		obj.printPattern(8);
		
	}

}
