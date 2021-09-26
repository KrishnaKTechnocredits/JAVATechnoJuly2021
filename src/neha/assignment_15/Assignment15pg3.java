package neha.assignment_15;

/*program 3 : return difference between sum of even number - sum of odd numbers. Difference has to be positive. 
 * print the answer in main method.
int[] arr = {12,2,13,9}
hint : 22 - 14 = 8
output : 8

int[] arr = {13,22,10,3}
hint : 32 - 16 = 16
output : 16*/
public class Assignment15pg3 {
	int diffSumEvenAndSumOdd(int[] numArr) {
		int evenSum, oddSum;
		evenSum = 0;
		oddSum = 0;
		for (int index = 0; index < numArr.length; index++) {
			if (numArr[index] % 2 == 0)
				evenSum += numArr[index];
			if (numArr[index] % 2 != 0)
				oddSum += numArr[index];
		}
		return Math.abs(evenSum - oddSum);

	}

	public static void main(String[] args) {
		Assignment15pg3 assignment15pg3 = new Assignment15pg3();
		int[] arr = {13,22,10,3};
		System.out.println("Difference between sum of even number - sum of odd numbers is "
				+ assignment15pg3.diffSumEvenAndSumOdd(arr));
	}

}
