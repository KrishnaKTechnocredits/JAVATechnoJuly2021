package neha.assignment_13;
/*program 2 : count number of zero's in given array.
int[] input = {1,-11,0,0,55,0,-23,0};
output : 4*/
public class Assignment13pg2 {
	int countOfPositiveNumbers(int[] inputArr) {
		int count = 0;
		for (int index = 0; index < inputArr.length; index++) {
			if (inputArr[index] == 0) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] input = {1,-11,0,0,55,0,-23,0};
		Assignment13pg2 assignment13pg2 = new Assignment13pg2();
		System.out.println(
				"Count of zero's in input array is: " + assignment13pg2.countOfPositiveNumbers(input));
	}
}
