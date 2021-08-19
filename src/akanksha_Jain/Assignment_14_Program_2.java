package akanksha_Jain;

public class Assignment_14_Program_2 {
	static int min=100;
	
	int findMinNumber(int[] input) {
		for(int index = 0;index<input.length;index++){
			if(input[index]<min)
				min = input[index];
		}			
		return min;
	}
	
	public static void main(String[] args) {
		int[] input = {1,11,44,23,55,99,23};
		Assignment_14_Program_2 program_2 = new Assignment_14_Program_2();
		program_2.findMinNumber(input);
		System.out.println("The minimum number in array is " + min);
	}
}
