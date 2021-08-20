package neha;

/*program 1 : return count of positive numbers from given array.
int[] input = {1,-11,-44,23,55,-99,-23,-22};
output : 3*/
public class Assignment13pg1 {
	int countOfPositiveNumbers(int[] inputArr) {
		int count = 0;
		for (int index = 0; index < inputArr.length; index++) {
			if (inputArr[index] > 0) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] input = { 1, -11, -44, 23, 55, -99, -23, -22 };
		Assignment13pg1 assignment13pg1 = new Assignment13pg1();
		System.out.println(
				"Count of positive numbers in input array is: " + assignment13pg1.countOfPositiveNumbers(input));
	}

}
