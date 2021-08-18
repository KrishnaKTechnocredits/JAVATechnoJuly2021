package monika;

public class Assignment13_Program1 {

	int count=0;
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
		Assignment13_Program1 program1 = new Assignment13_Program1();
		program1.returnCount(input);
	}
}
