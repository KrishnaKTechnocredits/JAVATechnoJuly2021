package atul_K.Assignments.Ass13;

public class Assignment13 {

	int getPositiveNum(int[] input) {
		int count = 0;
		for (int index=0;index < input.length; index++ ) {		
			if (input[index]>0) {
				count++;
			}				
		}
		return count;
	}
	
	int getNumZero(int[] input) {
		int count = 0;
		for (int index=0;index < input.length; index++ ) {		
			if (input[index]== 0) {
				count++;
			}			
		}
		return count;
	}
	
	void getSmallerNum(int num) {
		int smaller = num;
		for (int index = 0;index <5; index++) {
			smaller = --num;
			System.out.println(smaller);
		}
	}
	
	public static void main (String[] args) {
		int[] input = {1,-11,0,23,55,-99,-23,0};
		Assignment13 assignment13 = new Assignment13();
		System.out.println("No. of Positive Num: "+assignment13.getPositiveNum(input)); // Program1
		System.out.println("No. of zero :"+assignment13.getNumZero(input)); // Program2
		assignment13.getSmallerNum(50); // Program2
	}
	
}
