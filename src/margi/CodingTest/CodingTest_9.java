package margi.CodingTest;

/*find closest negative number with respect to 8 
int[] arr = {-3,11,123,-11,-9,-55,33,44};
output : -3*/

public class CodingTest_9 {

	int getClosestNumber(int[] input) {
		int closest = input[0];
		for (int index = 0; index < input.length; index++) {
			if(input[index] < 0) {
				if(closest < input[index]) {
					closest = input[index]; 
				}
			}
		}
		return closest;
	}

	public static void main(String[] args) {
		CodingTest_9 codingTest_9 = new CodingTest_9();
		int[] arr = { -3, 11, 123, -11, -9, -55, 33, 44 };
		System.out.println("Closest negative number to 0: " + codingTest_9.getClosestNumber(arr));
	}
}
