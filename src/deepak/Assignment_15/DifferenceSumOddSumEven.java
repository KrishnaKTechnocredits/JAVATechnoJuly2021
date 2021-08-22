//Assignment 15 [Program 3] [difference between sum of even number - sum of odd numbers] DATE: 08/16
package deepak.Assignment_15;

public class DifferenceSumOddSumEven {
	
	int getEvenSum(int[] array) {
		int evenSum=0;
		int oddSum=0;
		for(int i = 0 ; i<array.length ; i++) {
			if(array[i] % 2 == 0) {
				evenSum=evenSum+array[i];
			}if(array[i] % 2 != 0) {
				oddSum=oddSum+array[i];
			}
		} return Math.abs(evenSum-oddSum); 					// Use of Math.absolute method
	}
	
	public static void main(String[] args) {
		DifferenceSumOddSumEven obj=new DifferenceSumOddSumEven();
		int[] array1= {12,2,13,9};
		int[] array2= {13,22,10,3};
		System.out.print("Difference between the sum of Even Numbers and Odd Numbers for 1st Array is: ");
		System.out.println(obj.getEvenSum(array1));
		System.out.print("Difference between the sum of Even Numbers and Odd Numbers for 2nd Array is: ");
		System.out.println(obj.getEvenSum(array2));	
	}
}
