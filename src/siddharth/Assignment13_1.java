package siddharth;

public class Assignment13_1 {
	void positiveNumberCount(int[] num) {
		for(int index=0;index < num.length;index++) {
			if (num[index] >= 0 ) {
			System.out.println( "Positive numbers are: "+num[index]);
			}
		}
	}
	
	
	
	
	public static void main(String[] args) {
		Assignment13_1 assignment13 = new Assignment13_1();
		int[] input = {1,-11,-44,23,55,-99,-23,-22};
		assignment13.positiveNumberCount(input);
		

	} 
}



