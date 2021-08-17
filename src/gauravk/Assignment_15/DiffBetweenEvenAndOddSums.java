package gauravk.Assignment_15;
/*
 * Assignment 15 : 16th Aug'2021


*program 1*:  wap that will return difference of even length name and odd lenght name.
arr[0] = "Maulik";
		
arr[1] = "Techno";
		
arr[2] = "Nidhi";
		
arr[3] = "Ankit";

output : 2



program 2 : return middle char of all elements of the String array.
String[] str = {"hello","techno","credits"};
char charAt(int index){
}

Hint : charAt method of String class helps to retrieve character on given index


program 3 : return difference between sum of even number - sum of odd numbers. Difference has to be positive. print the answer in main method.

int[] arr = {12,2,13,9}

hint : 22 - 14 = 8

output : 8

int[] arr = {13,22,10,3}
hint : 32 - 16 = 16
output : 16
 */
public class DiffBetweenEvenAndOddSums {
	
	int differenceFinder(int[] array) {
		int evenSum=0, oddSum=0;
		for(int j=0; j<array.length; j++) {
			if(array[j]%2==0)
				evenSum += array[j];
			else oddSum += array[j];
		}
		
		if(evenSum>oddSum)
			return evenSum-oddSum;
		else return oddSum-evenSum;
	}
	
	public static void main(String[] a) {
		int[] arr = {12,2,13,9};
		int[] arr1 = {13,22,10,3};
		DiffBetweenEvenAndOddSums diff1 = new DiffBetweenEvenAndOddSums();
		
		System.out.print("Difference between sum of even and odd numbers from the array {");
		for(int i=0; i<arr.length; i++)
			System.out.print(" "+arr[i]+" ");
		System.out.println("} is "+diff1.differenceFinder(arr));
		
		System.out.print("Difference between sum of even and odd numbers from the array {");
		for(int i=0; i<arr1.length; i++)
			System.out.print(" "+arr1[i]+" ");
		System.out.println("} is "+diff1.differenceFinder(arr1));
	}
}
