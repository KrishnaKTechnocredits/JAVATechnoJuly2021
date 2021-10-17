package arti_G_Assignment53;

public class Program13 {

	void printPattern(int rows) {
		for(int index=1;index<=rows;index++) {
			for(int innerIndex=1;innerIndex<=rows;innerIndex++) {
				if((index+innerIndex)%2==0)
					System.out.print("1");
				else
					System.out.print("0");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		new Program13().printPattern(5);
	}

}
