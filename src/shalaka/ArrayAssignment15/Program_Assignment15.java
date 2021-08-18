package shalaka.ArrayAssignment15;
/*program 3 : return difference between sum of even number - sum of odd numbers. Difference has to be positive. print the answer in main method.

int[] arr = {12,2,13,9}

hint : 22 - 14 = 8

output : 8

int[] arr = {13,22,10,3}
hint : 32 - 16 = 16
output : 16*/

public class Program_Assignment15 {

	int DiffOfSumOfEvenANdOdd(int arr[]) {
		//int arr[] = new int[4];
		int evenSum = 0;
		int oddSum = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] % 2 == 0)
				evenSum += arr[index];
			else
				oddSum += arr[index];
		}
		if (evenSum > oddSum)
			return evenSum - oddSum;
		else
			return oddSum - evenSum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 12, 2, 13, 9 };
		Program_Assignment15 program_Assignment15 = new Program_Assignment15();
		int difference = program_Assignment15.DiffOfSumOfEvenANdOdd(arr);
		System.out.println("Difference between sum of even number - sum of odd numbers is: " + difference);
	}

}
