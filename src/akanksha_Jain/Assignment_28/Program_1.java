package akanksha_Jain.Assignment_28;

public class Program_1 {
	static int max = 0, secondMax=0;

	int[] findMaxNumber(int[] input) {
		int indexNumber = 0;
		for(int index = 0; index<input.length; index++){
			if(input[index]>max) {
				max = input[index];
				indexNumber = index;
			}	
		}
		input[indexNumber] = 0;
		return input;
	}
	
	int findSecondMaxNumber(int[] input) {
		int[] newInput = findMaxNumber(input);
		for(int index = 0; index<newInput.length; index++){
			if(newInput[index]>secondMax) {
				secondMax = newInput[index];
			}
		}
		return secondMax;
	}
	
	public static void main(String[] args) {
		int[] input = {10,23,2,11,55,43,99};
		Program_1 program_1 = new Program_1();
		program_1.findSecondMaxNumber(input);
		System.out.println("The second maximum number in array is " + secondMax);
	}
}
