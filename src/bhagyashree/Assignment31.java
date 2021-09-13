package bhagyashree;

public class Assignment31 {

	// verify given number is a perfect square
	void findPerfectSquare(int number) {
		int newnum = (int) Math.sqrt(number);
		if (number == (newnum * newnum)) {
			System.out.println(number + " is perfect square");
		} else {
			System.out.println(number + " is not perfect square");
		}
	}

	// to find total triplets in a given array
	int getTripletCount(int[] array) {
		int count = 0;
		for (int index = 0; index < array.length - 2; index++) {
			if (array[index] == array[index + 1] - 1 && array[index] == array[index + 2] - 2) {
				System.out.print(array[index] + " " + array[index + 1] + " " + array[index + 2] + "\n");
				count++;
			}
		}
		return count;
	}

	// to find perfect numbers in a given range
	boolean isPerfectNumber(int number) {
		int sum = 1;
		boolean flag = false;
		for (int index = 2; index <= number / 2; index++) {
			if (number % index == 0)
				sum += index;
		}
		if (sum == number)
			return flag = true;
		else
			return flag = false;
	}

	void getPerfectNumberWithinRange(int x, int y) {
		for (int index = x; index <= y; index++) {

			if (isPerfectNumber(index))
				System.out.println(index + " is a perfect number");
			/*
			 * else { System.out.println(index+ " is not perfect number"); }
			 */
		}
	}

	/*
	 * void getPerfectNumberWithinRange(int x,int y) { for(int
	 * index=x;index<=y;index++) {
	 * 
	 * findGivenNumberIsPerfect(index);
	 * 
	 * } }
	 */

	public static void main(String[] args) {
		Assignment31 ass31 = new Assignment31();
		ass31.findPerfectSquare(25);
		ass31.findPerfectSquare(30);
		System.out.println("---------------------------------------------------");

		int[] input = { 10, 23, 24, 25, 26, 61, 62, 64, 65, 66 };
		System.out.println("Total triplets found: " + ass31.getTripletCount(input));
		System.out.println("---------------------------------------------------");

		System.out.println("Perfect Numbers betwwn 1 to 170 are: ");
		ass31.getPerfectNumberWithinRange(1, 170);

	}

}
