package riten;

class PositiveNumberCount {

	int count;

	int returnPositiveCount(int[] arr) {
		System.out.println(" Array is: ");
		for (int index = 0; index < arr.length; index++) {
			System.out.print(" "+arr[index]);
			if (arr[index] > 0)
				count++;
		}
		return count;

	}

	public static void main(String[] args) {
		PositiveNumberCount positivecount = new PositiveNumberCount();
		int[] input = { 1, -11, -44, 23, 55, -99, -23, -22 };
		System.out.println("\nPositive count of array is "+positivecount.returnPositiveCount(input));
	}

}