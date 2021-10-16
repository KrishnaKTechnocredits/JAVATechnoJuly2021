package umakant.patterns;

public class Pattern14 {
	
	void printPatter(int rows) {
		for(int index=1;index<=rows;index++) {
			char ch = 'A';
			for(int innerIndex=1;innerIndex<=index;innerIndex++) {
				System.out.print(ch++);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		new Pattern14().printPatter(5);
	}

}
