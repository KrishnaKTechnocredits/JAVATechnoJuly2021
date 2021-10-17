package arti_G_Assignment53;

public class Program15 {

	void printPattern(int rows) {
		char ch='A';
		int num=1;
		for(int index=1;index<=rows;index++) {
			for(int innerIndex=1;innerIndex<=6;innerIndex++) {
				if(innerIndex%2==1)
					System.out.print(num++);
				else
					System.out.print(ch++);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		new Program15().printPattern(5);

	}

}
