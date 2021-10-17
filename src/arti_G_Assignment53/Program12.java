package arti_G_Assignment53;

public class Program12 {
	
	void printPattern(int rows) {
		for(int index=1;index<=rows;index++) {
			for(int innerIndex=index;innerIndex>=1;innerIndex--) {
				System.out.print(innerIndex);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Program12().printPattern(5);

	}

}
