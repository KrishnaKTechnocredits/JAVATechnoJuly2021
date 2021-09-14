/* Assignment - 28 : 4th Sep'2021
Program 2: Find nth highest number from array.
int[] arr = {10,23,2,11,55,43,99};
input n = 3;
output : 43
*/

package akanksha_Jain.Assignment_28;

public class Program_2 {
	int[] input = {10,23,2,11,55,43,99};
	int nthMax=0;

	int findMaxNumber(int[] input) {
		int max = input[0];
		int indexNumber = 0;
		for(int index = 0; index<input.length; index++){
			if(input[index]>max) {
				max = input[index];
				indexNumber = index;
			}	
		}
		input[indexNumber] = 0;
		return max;
	}
	
	int nthMaxNumber(int number) {
		for(int n=0; n<number; n++) {
			nthMax = findMaxNumber(input);
		}
		return nthMax;
	}
	
	public static void main(String[] args) {
		Program_2 program_2 = new Program_2();
		System.out.println("The nth maximum number in array is " + program_2.nthMaxNumber(3));
	}
}
