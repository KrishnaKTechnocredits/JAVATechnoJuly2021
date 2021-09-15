/*
 * Program 1: Find second highest number from array.
int[] arr = {10,23,2,11,55,43,99};
output : 55

Program 2: Find nth highest number from array.
int[] arr = {10,23,2,11,55,43,99};
input n = 3;
output : 43
 */

package tanmoy_Roy.Assignment28;

import java.util.Arrays;
import java.util.Scanner;

public class Program1 {
	
	int getSecondMaxArrayElement(int[] input) {
		int firstMax=input[0],secondMax=input[0];
			if(input.length>=2) {
				for (int i=0 ; i<input.length ; i++) {
					if(input[i]>firstMax) {
						secondMax=firstMax;
						firstMax=input[i];
					}
					else if(input[i]<firstMax && input[i]>secondMax)
						secondMax=input[i];
				}
			}
			return secondMax;
	}
	
	int getKthMaxArrayElement(int[] input, int k) {
		Arrays.sort(input);
		return input[input.length-k];
	}


	public static void main(String[] args) {
		Program1 prg = new Program1();
		Scanner scan =new Scanner(System.in);
		char entermore='Y';
		while(entermore=='Y' || entermore=='y') {
			System.out.println("Enter the array : ");
			String[] input = scan.nextLine().split(",");
			int[] arr1= new int[input.length];
			for(int i=0 ;i<input.length;i++)
				arr1[i]=Integer.parseInt(input[i]);
			System.out.println("The 2nd Maximum Array element  :"+ prg.getSecondMaxArrayElement(arr1));
			
			System.out.println("Enter the array : ");
			input = scan.nextLine().split(",");
			int[] arr2= new int[input.length];
			for(int i=0 ;i<input.length;i++)
				arr2[i]=Integer.parseInt(input[i]);
			System.out.println("Enter the value of K : ");
			int k = Integer.parseInt(scan.nextLine());
			System.out.println("The Kth Maximum Array element  :"+ prg.getKthMaxArrayElement(arr2,k));
			
			System.out.println("Want to Enter more (Y/N): ");
			entermore = scan.nextLine().charAt(0);
		}
		scan.close();
	}


}

