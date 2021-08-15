package madhavi;

public class DifferenceBetweenMaxandMinArrayItem {

	public static void main(String[] args) {
		
		int[] inputArray1 = { 1, 11, 44, 23, 55, 99, 23 };
		
		MaxNumberFromArray maxNumberFromArray = new MaxNumberFromArray();
		MinNumberFromArray minNumberFromArray = new MinNumberFromArray();
		
		System.out.println(maxNumberFromArray.getMaxnumber(inputArray1) - minNumberFromArray.getMinnumber(inputArray1));

	}

}
