package neha.assignment_14;

/*program 3 : print difference between max and min number from given array.
int[] input = {1,11,44,23,55,99,23};
output : 98*/
public class Assignment14pg3 {

	int diffBetweenMaxAndMinNumber(int[] inputArr) {
		int minNumber = inputArr[0];
		int maxNumber = inputArr[0];
		for (int index = 0; index < inputArr.length; index++) {
			if (inputArr[index] > maxNumber)
				maxNumber = inputArr[index];
			else if (inputArr[index] < minNumber)
				minNumber = inputArr[index];
		}
		return maxNumber - minNumber;
	}

	public static void main(String[] args) {
		Assignment14pg3 assignment14pg3 = new Assignment14pg3();
		int[] input = { 1, 11, 44, 23, 55, 99, 23 };
		System.out.println("Difference between minimum and maximum numbers is: "
				+ assignment14pg3.diffBetweenMaxAndMinNumber(input));
	}

}
