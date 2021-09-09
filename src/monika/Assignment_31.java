package monika;

public class Assignment_31 {
	void getCountTripletsInGivenArray(int[] input) {
		int count = 0;
		for (int index = 0; index < input.length - 2; index++) {
			if (input[index] == input[index + 1] - 1 && input[index] == input[index + 2] - 2)
				count++;
		}
		System.out.println("Number of triplets in given array is " + count);
	}
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
	void getPerfectNumberFromGivenRange(int startIndex, int endIndex) {
		for (int index = startIndex; index <= endIndex; index++) {
			if (isPerfectNumber(index))
				System.out.println(index + " is a Perfect Number");
		}
	}

	public static void main(String[] args) {
		int[] input = { 10, 23, 24, 25, 26, 61, 62, 64, 65, 66 };
		Assignment_31 assignment_31 = new Assignment_31();
	
		
		assignment_31.getCountTripletsInGivenArray(input);
		assignment_31.getPerfectNumberFromGivenRange(1, 170);
	}
}
