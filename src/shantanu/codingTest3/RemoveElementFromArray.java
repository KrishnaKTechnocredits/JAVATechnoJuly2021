package shantanu.codingTest3;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementFromArray {
	int[] arr;
	int eleToRemove;
	void createArrayAndGetElementToRemove(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array:");
		int size = sc.nextInt();
		arr = new int[size];
		System.out.println("Enter elements of the array:");
		for(int index = 0; index < size; index++)
			arr[index] = sc.nextInt();
		System.out.println("Enter an element to remove:");
		eleToRemove = sc.nextInt();
	}
	int[] removeElement(int[] arr,int eleToRemove) {
		int[] newArr = null;
		int count = 0;
		boolean flag = false;
		for(int index = 0; index < arr.length; index++) {
			if(arr[index] == eleToRemove) {
				count++;
				flag = true;
			}
		}
		if(flag) {
			newArr = new int[arr.length - count];
			if(newArr.length == 0)
				System.out.println("All elements are removed.");
			else {
				for(int index = 0, newIndex = 0; index < arr.length; index++) {
					if(arr[index] == eleToRemove)
						continue;
					else {
						while(newIndex < newArr.length) {
							newArr[newIndex] = arr[index];
							newIndex++;
							break;
						}
					}
						
				}
			}
		}
		else
			System.out.println("No such element!!");
		return newArr;	
	}
	void displayArray(int[] arr) {
		System.out.println("Original Array:");
		System.out.println(Arrays.toString(arr));
	}
	void displayArray(int[] arr, int eleToRemove) {
		System.out.println("Array after removing "+eleToRemove +":"+ Arrays.toString(removeElement(arr,eleToRemove)));
	}
	public static void main(String[] args) {
		RemoveElementFromArray removeElementFromArray = new RemoveElementFromArray();
		removeElementFromArray.createArrayAndGetElementToRemove();
		removeElementFromArray.displayArray(removeElementFromArray.arr);
		removeElementFromArray.displayArray(removeElementFromArray.arr, removeElementFromArray.eleToRemove);
	}
}
