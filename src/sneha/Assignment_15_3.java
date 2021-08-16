// return difference between sum of even number and sum of odd numbers. difference has to be positive.

package sneha;

public class Assignment_15_3 {
	
	int diffSumOddEven(int[] arr) {
		int diff = 0;
		int sumEven = 0, sumOdd =0;
		for(int index = 0 ; index < arr.length; index++) {
			if((arr[index] %2) == 0) {
				sumEven = sumEven + arr[index];
			}
			else {
				sumOdd = sumOdd + arr[index];
			}
		}
		diff = sumEven - sumOdd;
		if(diff < 0) {
			diff = -diff;
		}
		return diff;
	}

	public static void main(String[] a) {
		
		int[] arr = {12,2,13,9};
		int res = 0;
		Assignment_15_3 assignment_15_3 = new Assignment_15_3();
		res = assignment_15_3.diffSumOddEven(arr);
		System.out.println("Difference is :" + res);
	}
}
