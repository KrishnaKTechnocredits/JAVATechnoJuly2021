package tarang_Assignment_13;

/* Assignment 13 : 15th Aug'2021
program 2 : count number of zero's in given array.
int[] input = {1,-11,0,0,55,0,-23,0};
output : 4
*/


public class Assignment_13_Program_2 {
	static int count;

	void getCountOfZero(int[] input) {
		for(int index=0; index<input.length; index++) {
			if(input[index]==0) {
				count ++;
			}
		}
		System.out.println("The count of zero's in given array: " + count);
	}
	
	public static void main(String[] args) {
		int[] input = {1,-11,0,0,55,0,-23,0};
		Assignment_13_Program_2 program2 = new Assignment_13_Program_2();
		program2.getCountOfZero(input);
	}
}
