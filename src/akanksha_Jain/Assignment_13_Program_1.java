package akanksha_Jain;

public class Assignment_13_Program_1 {
	static int count;

	void returnCount(int[] input) {
		for(int index=0; index<input.length; index++) {
			if(input[index]>0) {
				count ++;
			}
		}
		System.out.println("The count of positive numbers from given array: " + count);
	}
	
	public static void main(String[] args) {
		int[] input = {1,-11,-44,23,55,-99,-23,-22};
		Assignment_13_Program_1 program1 = new Assignment_13_Program_1();
		program1.returnCount(input);
	}
}
