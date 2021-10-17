package arti_G_Assignment53;

public class Program4 {

	void printPattern(int rows) {
		int totalRowElement=2*rows-1;
		for(int index=1;index<=rows;index++) {
			int numberOfStars=(2*index-1);
			for(int innerIndex=1;innerIndex<=(totalRowElement-numberOfStars)/2;innerIndex++) {
				System.out.print(" ");
			}
			for(int innerIndex=1;innerIndex<=numberOfStars;innerIndex++) {
				System.out.print("*");
			}
			for(int innerIndex=1;innerIndex<=(totalRowElement-numberOfStars)/2;innerIndex++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		for(int index=rows-1;index>=1;index--) {
			int numberOfStars=(2*index-1);
			for(int innerIndex=1;innerIndex<=(totalRowElement-numberOfStars)/2;innerIndex++) {
				System.out.print(" ");
			}
			for(int innerIndex=1;innerIndex<=numberOfStars;innerIndex++) {
				System.out.print("*");
			}
			for(int innerIndex=1;innerIndex<=(totalRowElement-numberOfStars)/2;innerIndex++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		new Program4().printPattern(6);
	}

}
