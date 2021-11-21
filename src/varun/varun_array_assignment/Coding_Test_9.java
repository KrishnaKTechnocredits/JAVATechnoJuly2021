/*find closest negative number with respect to 8 
int[] arr = {-3,11,123,-11,-9,-55,33,44};
output : -3*/

package varun.varun_array_assignment;

public class Coding_Test_9 {
	
	void findClosestNumberToZero(int []input) {
		int temp=input[0];
		for(int index=0;index<input.length;index++) {
			if(input[index]<0 && temp<input[index]) {
				temp=input[index];
			}
		}
		System.out.println("Closes number to 0 from given list is " +temp);
	}
	
	public static void main(String[] args) {
		int[] arr = {-3,11,123,-11,-9,-55,33,44};
		Coding_Test_9 coding_Test_9 = new Coding_Test_9();
		coding_Test_9.findClosestNumberToZero(arr);
	}
}
