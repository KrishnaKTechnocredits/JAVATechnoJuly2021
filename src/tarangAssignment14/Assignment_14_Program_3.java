/* Assignment 14 : 15th Aug'2021
program 3 : print difference between max and min number from given array.
int[] input = {1,11,44,23,55,99,23};
output : 98
*/

package tarangAssignment14;

public class Assignment_14_Program_3 {
	static int max=0;
	static int min=100;
	
	int findMaxNumber(int[] input) {
		for(int index = 0;index<input.length;index++){
			if(input[index]>max)
				max = input[index];
		}			
		return max;
	}
	
	int findMinNumber(int[] input) {
		for(int index = 0;index<input.length;index++){
			if(input[index]<min)
				min = input[index];
		}			
		return min;
	}
	
	public static void main(String[] args) {
		int diff;
		int[] input = {1,11,44,23,55,99,23};
		Assignment_14_Program_3 program_3 = new Assignment_14_Program_3();
		program_3.findMaxNumber(input);
		program_3.findMinNumber(input);
		diff = max - min;
		System.out.println("The difference between maximum and minimum number from given array is " + diff);
	}
}
