package somnath;
public class CodingTest_1 {
	int getSumOfAllNum(String arr) {
		int sum = 0;
		for(int index =0;index<arr.length();index++) {
			if(Character.isDigit(arr.charAt(index)))
				sum +=Character.getNumericValue(arr.charAt(index));
		}
		return sum;
	}

	int getSumOfEachStringFromArray(String[] input) {
		int sum=0;
		for(int index=0;index<input.length;index++) {
			sum+=getSumOfAllNum(input[index]);
		}
		return sum;
	}

	public static void main(String[] args) {
		CodingTest_1 CodingTest_1 = new CodingTest_1();
		String input[] = {"t2e4c", "2h7no", "3h6h2h5", "1mk3", "k9g8"};
		System.out.println("Sum of numbers from the given string array is " +CodingTest_1.getSumOfEachStringFromArray(input));

	}
}