/*
  Test - 9 : 21st Nov'2021
find closest negative number with respect to 8 
int[] arr = {-3,11,123,-11,-9,-55,33,44};
output : -3

 */

package umakant;

public class Coding9 {

	int getNearestNumber(int[] input) {
		int output = Integer.MIN_VALUE;
		for (int num : input) {
			if (num < 0 && num > output)
				output = num;
		}
		return output;
	}

	public static void main(String[] args) {
		int[] array = { -3, 11, 123, -11, -9, -55, 33, 44 };
		System.out.println(new Coding9().getNearestNumber(array));
	}

}
