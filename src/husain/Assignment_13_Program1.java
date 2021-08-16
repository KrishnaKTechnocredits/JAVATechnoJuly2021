package husain;

public class Assignment_13_Program1 {
	int numCount;

	int countOfPositiveNumbers(int[] num) {

		for (int index = 0; index < num.length; index++) {
			if (num[index] > 0)
				numCount++;
		}
		return numCount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_13_Program1 obj = new Assignment_13_Program1();
		int[] input = { 1, -11, -44, 23, 55, -99, -23, -22 };
		int count = obj.countOfPositiveNumbers(input);
		System.out.println("The count of positive numbers in the given array is: " + count);
	}

}
