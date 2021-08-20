package neha;

/*program 1 : find maximum number from given array.
int[] input = {1,11,44,23,55,99,23};
output : 99*/
public class Assignment14pg1 {
	int maxNumberInGivenArray(int[] inputArr) {
		int maxNumber = inputArr[0];
		for (int index = 0; index < inputArr.length; index++) {
			if (inputArr[index] > maxNumber)
				maxNumber = inputArr[index];
		}
		return maxNumber;
	}

	public static void main(String[] args) {
		Assignment14pg1 assignment14pg1 = new Assignment14pg1();
		int[] input = { 1, 11, 44, 23, 55, 99, 23 };
		System.out.println("Maximum number in given array is: " + assignment14pg1.maxNumberInGivenArray(input));
	}

}
