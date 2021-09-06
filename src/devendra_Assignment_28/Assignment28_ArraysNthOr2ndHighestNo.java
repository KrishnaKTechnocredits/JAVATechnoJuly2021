package devendra_Assignment_28;

import java.util.Scanner;

import java.util.Arrays;

public class Assignment28_ArraysNthOr2ndHighestNo {
	/*
	Program 1: Find second highest number from array.
	int[] arr = {10,23,2,11,55,43,99};
	output : 55 
	*/
	int getSecondHighNumber(int[] arr) {
		int highestNumber=arr[0];
		int secondHighestNumber=arr[0];
		for(int index=0;index<arr.length;index++) {
			if(arr[index]>highestNumber) {
				secondHighestNumber=highestNumber;
				highestNumber=arr[index];
			}
			else if(arr[index]>secondHighestNumber) {
				secondHighestNumber=arr[index];
			}
		}
		return secondHighestNumber;
	}
	
	/*
	Program 2: Find nth highest number from array.
	int[] arr = {10,23,2,11,55,43,99};
	input n = 3;
	output : 43 
	*/
	int getNthHighestNumber(int[] arr,int num) {
		int maxIndexValue=0;
		int max=0;
		for(int index=1;index<=num;index++) {
			max=arr[0]; 
			for(int index2=1;index2<arr.length;index2++) {
				if(max<arr[index2]) {
					max=arr[index2];
					maxIndexValue=index2;
				}
			}
			arr[maxIndexValue]=0;
		}
		return max;
	}
	
		public static void main(String[] args) {
			Assignment28_ArraysNthOr2ndHighestNo highest_2nd =new Assignment28_ArraysNthOr2ndHighestNo();
			int[] arr1 = {10,23,2,11,55,43,99};
			System.out.println("Given Array : " +Arrays.toString(arr1));
			System.out.println("Second Highest Number is : "+highest_2nd.getSecondHighNumber(arr1));
			
			Scanner scanner = new Scanner(System.in);
			int[] arr2 = {10,23,2,11,55,43,99};
			System.out.println("-----------\nGiven Array : "+Arrays.toString(arr2));
			System.out.print("Enter Input : ");
			int num = scanner.nextInt();
			System.out.println("Nth highest number is: "+highest_2nd.getNthHighestNumber(arr2, num));
	}


}
