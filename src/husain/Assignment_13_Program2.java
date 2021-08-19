package husain;

public class Assignment_13_Program2 {

	int numCount;

	int countOfZeros(int[] num) {

		for (int index = 0; index < num.length; index++) {
			if (num[index] == 0)
				numCount++;
		}
		return numCount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_13_Program2 obj = new Assignment_13_Program2();
		int[] input = { 1, -11, 0, 0, 55, 0, -23, 0 };
		int count = obj.countOfZeros(input);
		System.out.println("The count of zeros in the given array is: " + count);
	}

}
