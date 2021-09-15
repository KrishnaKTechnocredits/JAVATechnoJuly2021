package indrani;

public class Assignment_31_program3 {
	
	int getTriplets(int[] input) {
		int count = 0;
		for(int index = 0; index < input.length-2;index++) {
			if((input[index]+1 == input[index+1])&&(input[index]+2 == input[index+2])) {
				count++;
			}
		}
		return count;
	}
	void displayTriplets(int[] input) {
		System.out.println("Total sets of 3 consecutive numbers in array: "+getTriplets(input));
	}
	public static void main(String[] args) {
		Assignment_31_program3 program3 = new Assignment_31_program3();
		int[] input = {10,23,24,25,26,61,62,64,65,66};
		program3.displayTriplets(input);
	}
}
