package arti_G_Assignment53;

public class Program6 {

	void printPattern(int rows) {
		for(int index=rows;index>=1;index--) {
			for(int innerIndex=(rows-index);innerIndex>=1;innerIndex++) {
				System.out.print(" ");
			}
			for(int innerIndex=1;innerIndex<=index;innerIndex++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
	public static void main(String[] args) {
		new Program5().printPattern(6);
	}

}
