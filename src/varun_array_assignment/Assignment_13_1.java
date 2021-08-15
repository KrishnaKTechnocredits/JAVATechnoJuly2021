/*program 2 : count number of zero's in given array.
int[] input = {1,-11,0,0,55,0,-23,0};

output : 4*/

package varun_array_assignment;

public class Assignment_13_1 {
	int count;
	void countNumberOfZero(int []arr) {
		for (int index=0;index<arr.length;index++) {
			if(arr[index]==0)
				count++;
		}
		System.out.println("Total number of zero in given array is "+count);
	}
	public static void main(String[] args) {
		Assignment_13_1 assignment_13_1 = new Assignment_13_1();
		int[] input = {1,-11,0,0,55,0,-23,0};
		assignment_13_1.countNumberOfZero(input);
	}
}
