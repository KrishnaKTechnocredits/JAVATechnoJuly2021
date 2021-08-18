package madhavi;

public class DifferenceBetweenMaxOddandMaxEvenItem {
	
	
	int getMaxOddEvenNumber(int[] arr) {
		int maxEven = 0;
		int maxOdd = 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {

				if (arr[i] > maxEven) {
					maxEven = arr[i];
				}
			} else {

				if (arr[i] > maxOdd) {
					maxOdd = arr[i];
				}
			}
		}
		return maxOdd - maxEven;
	}
	
	public static void main(String[] args) {
		
		DifferenceBetweenMaxOddandMaxEvenItem differenceBetweenMaxOddandMaxEvenItem = new DifferenceBetweenMaxOddandMaxEvenItem(); 
		
		System.out.println("Print difference between max odd number and max even number from given array");
		int[] inputArray2 = { 1, 11, 44, 23, 55, 99, 23, 22 };
		System.out.println(differenceBetweenMaxOddandMaxEvenItem.getMaxOddEvenNumber(inputArray2));
	}

}
