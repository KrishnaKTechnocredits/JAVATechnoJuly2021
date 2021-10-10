package suruchi.Assignment41;

public class Program_A41 {

	void printPattern(int patternCount) {
		for(int index = 1; index <= patternCount; index++) {
			for(int index2 = 1; index2 <= index; index2++) {
				if(index % 2 != 0)
					System.out.print("*");
				else
					System.out.print("#");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Program_A41 program_A41 = new Program_A41();
		
		program_A41.printPattern(5);
	}
}