//Susrprise Coding Test 1 DATE: 08/26
package deepak.CodingTest_1;

public class SumOfDigitsInStringArray {

	int getSumOfDigitsFromEachString(String str) {
		int sum1 = 0;
		int sum2 = 0;
		int num = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				num = Character.getNumericValue(str.charAt(i));
				sum1 += num;
			}
		}
		return sum1;
	}

	int getSumOfDigits(String[] arr) {
		int sum = 0;
		int[] arr1 = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			String str = arr[i];
			arr1[i] = getSumOfDigitsFromEachString(arr[i]);
			sum = sum + arr1[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		SumOfDigitsInStringArray obj = new SumOfDigitsInStringArray();
		String[] input = { "t2e4c", "2h7no", "3h6h2h5", "1mk3", "k9g8" };
		System.out.print("Sum of digits from the array of Strings is: ");
		System.out.println(obj.getSumOfDigits(input));
	}

}
