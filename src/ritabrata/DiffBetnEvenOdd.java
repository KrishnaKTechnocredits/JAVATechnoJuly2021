/*Assignment15
 
program 3 : return difference between sum of even number - sum of odd numbers. Difference has to be positive. print the answer in main method.

int[] arr = {12,2,13,9}
hint : 22 - 14 = 8
output : 8
int[] arr = {13,22,10,3}
hint : 32 - 16 = 16
  */
package ritabrata;

public class DiffBetnEvenOdd {
	int getDiffEvenOdd(int[] input) {
		int evenSum = 0, oddSum = 0, diff=0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] % 2 == 0)
				evenSum += input[index];
			else
				oddSum += input[index];
		}
		
			if(evenSum>oddSum)
				diff= evenSum -oddSum;
			else
				diff= oddSum-evenSum;
			return diff;
		 
	}

	public static void main(String[] args) {
		DiffBetnEvenOdd diff= new DiffBetnEvenOdd();
		int[] arr1= {12,2,13,9};
		System.out.println("The difference is "+ diff.getDiffEvenOdd(arr1));
		System.out.println("----------------------");
		int[] arr2= {13,22,10,3};
		System.out.println("The difference is "+ diff.getDiffEvenOdd(arr2));
		
		
		

	}

}
