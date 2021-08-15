package madhavi;

public class MinNumberFromArray {
	
	int getMinnumber(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}

		}
		return min;
	}
	
	public static void main(String[] args) {
		MinNumberFromArray minNumberFromArray = new MinNumberFromArray();

		System.out.println("Print min number from given array");
		int[] inputArray1 = { 1, 11, 44, 23, 55, 99, 23 };
		System.out.println(minNumberFromArray.getMinnumber(inputArray1));
		
	}

}
