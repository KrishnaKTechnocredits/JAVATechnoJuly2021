package akanksha_Jain.Assignment_14;

public class Assignment_14_Program_1 {
	static int max = 0;

	int findMaxNumber(int[] input) {
		for(int index = 0;index<input.length;index++){
			if(input[index]>max)
				max = input[index];
		}			
		return max;
	}
	
	public static void main(String[] args) {
		int[] input = {1,11,44,23,55,99,23};
		Assignment_14_Program_1 program_1 = new Assignment_14_Program_1();
		program_1.findMaxNumber(input);
		System.out.println("The maximum number in array is " + max);
	}
}
