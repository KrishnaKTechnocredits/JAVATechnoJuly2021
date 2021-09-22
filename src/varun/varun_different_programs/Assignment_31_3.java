/*Program 3: 
int[] arr = {10,23,24,25,26,61,62,64,65,66};
output : 3
Note : 23,24,25
       24,25,26
	   64,65,66
*/
package varun.varun_different_programs;

public class Assignment_31_3 {
	int count = 0;

	void getConsecutiveNumbers(int[] input) {
		for (int index = 0; index < input.length - 2; index++) {
			if (input[index] + 1 == input[index + 1] && input[index] + 2 == input[index + 2])
				count++;
		}
		System.out.println("Count of triplets are " + count);
	}

	public static void main(String[] args) {
		int[] arr = { 10, 23, 24, 25, 26, 61, 62, 64, 65, 66 };
		Assignment_31_3 assignment_31_3 = new Assignment_31_3();
		assignment_31_3.getConsecutiveNumbers(arr);
	}

}