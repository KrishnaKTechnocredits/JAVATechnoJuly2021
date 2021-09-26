/* Assignment 13 : 15th Aug'2021
program 1 : return count of positive numbers from given array.
int[] input = {1,-11,-44,23,55,-99,-23,-22};
output : 3
*/

package akanksha_Jain.Assignment_13;

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
