package rasika;

public class Assignment28 {
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
		Assignment28 assignment28 = new Assignment28();
		assignment28.findSecondMaxNumber(input);
		System.out.println("The second maximum number in array is " + secondMax);
	}
}
