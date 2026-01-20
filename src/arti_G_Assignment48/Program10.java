package arti_G_Assignment48;

import java.util.ArrayList;

/*program 10 : append 0 after 3 consecutive number.
input : [1,2,3,5,4,7];
ouput : [1,2,3,0,5,4,7];
Hint : ArrayList*/
public class Program10 {

	ArrayList<Integer> appenZeroAfter3ConsecutiveNumber(int[] input) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		output.add(input[0]);
		output.add(input[1]);
		for (int index = 2; index < input.length; index++) {
			output.add(input[index]);
			if (input[index] - 1 == input[index - 1] && input[index] - 2 == input[index - 2]) {
				output.add(0);
			}
		}
		return output;
	}
	public static void main(String[] args) {
		Program10 p10 = new Program10();
		int[] input = {1,2,3,5,4,7};
		System.out.println(p10.appenZeroAfter3ConsecutiveNumber(input));
	}

}
