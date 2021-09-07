package shantanu.identicalArrays_assignment27;

import java.util.Scanner;

public class ArrayComparison {
	String compareArrays(int[] firstArray, int[] secondArray) {
		boolean identical = true;
		if(firstArray.length != secondArray.length)
			return "Not Identical";
		else {
			for(int index = 0; index < firstArray.length; index++)
				if(firstArray[index] != secondArray[index])
					identical = false;
		}
		if(identical)
			return "Identical";
		else
			return "Not Identical";
	}
	public static void main(String[] args) {
		ArrayComparison arrayComparison = new ArrayComparison();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of first array:");
		int firstSize = sc.nextInt();
		int[] firstArray = new int[firstSize];
		System.out.println("Enter elements of first array:");
		for(int index = 0; index < firstArray.length; index++)
			firstArray[index] = sc.nextInt();
		System.out.println("Enter size of second array:");
		int secondSize = sc.nextInt();
		int[] secondArray = new int[secondSize];
		System.out.println("Enter elements of second array:");
		for(int index = 0; index < secondArray.length; index++)
			secondArray[index] = sc.nextInt();
		System.out.println("Both arrays are "+arrayComparison.compareArrays(firstArray,secondArray));
	}
}
