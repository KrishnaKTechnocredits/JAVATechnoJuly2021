/*program 1 : find maximum number from given array.

int[] input = {1,11,44,23,55,99,23};
output : 99*/

package varun.varun_array_assignment;

public class Maximum_Number_From_Array_Assignment_14 {
	int max = 0;
	void maxNumber(int []input) {
		max = input[0];
		for(int index = 0;index<input.length;index++) {
			if(max<input[index])
				max = input[index];
		}
		System.out.println("Maximum number from the given array is " +max);
	}
	
	public static void main(String[] args) {
		Maximum_Number_From_Array_Assignment_14 assignment_14 = new Maximum_Number_From_Array_Assignment_14();
		int[] input = {1,11,44,23,55,99,23};
		assignment_14.maxNumber(input);
	}
}
