package arti_G_Assignment53;

public class Program5 {

	void printPattern(int rows) {
		for(int index=rows;index>=1;index--) {
			for(int innerIndex=1;innerIndex<=index;innerIndex++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		new Program5().printPattern(5);
	}

}
