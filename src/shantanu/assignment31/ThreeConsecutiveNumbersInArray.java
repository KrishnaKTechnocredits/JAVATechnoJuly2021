package shantanu.assignment31;

public class ThreeConsecutiveNumbersInArray {
	int getTripletsFromArray(int[] input) {
		int count = 0;
		for(int index = 0; index < input.length-2;index++) {
			if((input[index]+1 == input[index+1])&&(input[index]+2 == input[index+2])) {
				count++;
			}
		}
		return count;
	}
	void displayResult(int[] input) {
		System.out.println("Total pairs of 3 consecutive numbers in array: "+getTripletsFromArray(input));
	}
	public static void main(String[] args) {
		ThreeConsecutiveNumbersInArray threeConsecutiveNumbersInArray = new ThreeConsecutiveNumbersInArray();
		int[] input = {10,23,24,25,26,61,62,64,65,66};
		threeConsecutiveNumbersInArray.displayResult(input);
	}
}
