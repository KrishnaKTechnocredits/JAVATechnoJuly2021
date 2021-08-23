package neha;

/*program 2 : find minimum number from given array.
int[] input = {1,11,44,23,55,99,23};
output : 11*/
public class Assignment14pg2 {
	int minNumberInGivenArray(int[] inputArr) {
		int minNumber = inputArr[0];
		for (int index = 0; index < inputArr.length; index++) {
			if (inputArr[index] < minNumber)
				minNumber = inputArr[index];
		}
		return minNumber;
	}

	public static void main(String[] args) {
		Assignment14pg2 assignment14pg2 = new Assignment14pg2();
		int[] input = { 1, 11, 44, 23, 55, 99, 23 };
		System.out.println("Minimum number in given array is: " + assignment14pg2.minNumberInGivenArray(input));
	}
}
