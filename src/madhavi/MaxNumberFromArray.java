package madhavi;

public class MaxNumberFromArray {
	
	int getMaxnumber(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}

		}
		return max;
	}
	
	public static void main(String[] args) {
		MaxNumberFromArray maxNumberFromArray = new MaxNumberFromArray();

		System.out.println("Print max number from given array");
		int[] inputArray1 = { 1, 11, 44, 23, 55, 99, 23 };
		System.out.println(maxNumberFromArray.getMaxnumber(inputArray1));
	}

}
