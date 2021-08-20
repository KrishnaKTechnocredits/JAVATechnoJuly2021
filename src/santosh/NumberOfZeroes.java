package santosh;

public class NumberOfZeroes {

	int findNumberOfZeroes(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		NumberOfZeroes numberOfZeroes = new NumberOfZeroes();
        System.out.println("<<<<<<<<<<<<<~~~~~~~~~~~~~>>>>>>>>>>>>>");
		System.out.println("Total Count of zeroes in given array is");
		int[] input = { 1, -11, 0, 0, 55, 0, -23, 0 };
		System.out.println(numberOfZeroes.findNumberOfZeroes(input));
        System.out.println("<<<<<<<<<<<<<~~~~~~~~~~~~~>>>>>>>>>>>>>");
	}

}
