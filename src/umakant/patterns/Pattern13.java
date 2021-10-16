package umakant.patterns;

public class Pattern13 {
	
	void printPatter(int rows) {
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
		new Pattern13().printPatter(5);
	}

}
