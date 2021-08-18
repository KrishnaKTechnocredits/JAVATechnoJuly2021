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
public class DifferenceOddAndEvenLengthArray {
	
	int oddEvenDifference(String[] names) {
		int oddSum=0, evenSum=0;
		for(int i=0; i<names.length; i++) {
			if(names[i].length()%2==0)
				evenSum += names[i].length();
			else oddSum += names[i].length();
		}
		if(oddSum>evenSum)
			return oddSum - evenSum;
		else return evenSum - oddSum;
	}
	
	public static void main(String[] a) {
		String[] arr = {"Maulik", "Techno", "Nidhi", "Ankit"};
		System.out.println("Array of names:");
		for(int i=0; i<arr.length; i++)
			System.out.println("arr["+i+"] = "+arr[i]);
		
		System.out.println("Difference between odd length names and even length names is: "+new DifferenceOddAndEvenLengthArray().oddEvenDifference(arr));
	}
}