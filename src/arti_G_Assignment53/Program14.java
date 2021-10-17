package arti_G_Assignment53;

public class Program14 {

	void printPattern(int rows) {
		for(int index=1;index<=rows;index++) {
			char ch='A';
			for(int innerIndex=1;innerIndex<=index;innerIndex++) {
				System.out.print(ch++);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		new Program14().printPattern(5);
	}

}
