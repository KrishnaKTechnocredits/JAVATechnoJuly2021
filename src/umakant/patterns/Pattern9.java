package umakant.patterns;

public class Pattern9 {
	
	void printPatterns(int rows) {
		for(int index=1;index<=rows;index++) {
			for(int innerIndex=1;innerIndex<=index;innerIndex++)
				System.out.print(innerIndex);
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		new Pattern9().printPatterns(5);
	}

}
