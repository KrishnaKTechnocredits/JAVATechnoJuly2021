/*Assignment - 26 : 1st Sep'2021

Program : 1 
WAP to print Reverse a given String.
input : This is technocredits
output : stiderconhcet si sihT  

Program : 2 
reverse given string array.
input : {"Credits", "Techno","From","Diwali","Happy"}
output : {"Happy","Diwali","From","Techno","Credits"}

Program : 3 
swap 2 numbers with using 3rd variable

Program : 4 
swap 2 numbers without using 3rd variable

Assignment - 27 : 2nd Sep'2021

WAP to find 2 arrays are identical or not. 
int[] arr1 = {10,12,55,32,17};
int[] arr2 = {10,12,55,32,17}};
output : Identical
--------------------------------------------
int[] arr1 = {10,12,55,32,17,99};
int[] arr2 = {10,12,55,32,17}};
output : Not identical
------------------------------------
int[] arr1 = {10,12,55,32,17};
int[] arr2 = {10,12,99,32,17}};
output : Not Identical
*/

package tanmoy_Roy.Assignment26_27;

import java.util.Arrays;
import java.util.Scanner;

public class Program1 {
	
	String reverse(String input) {
		String reversedInput="";
		for (int i=input.length()-1;i>=0;i--) 
			reversedInput+=input.charAt(i);
		return reversedInput;
	}
	
	String[] reverseArray(String[] input) {
		int n= input.length,i=0;
		String[] array = new String[n];
		while(i<n)
			array[i]=input[n-1-i++];
		return array;
	}
	
	boolean isEqual(String[] arr1, String[] arr2) {
		boolean flag=true;
		if (arr1.length!=arr2.length)
			flag=false;
		else
			for(int i=0;i<arr1.length;i++) 
				if(!arr1[i].equals(arr2[i])) {
					flag=false;
					break;
				}
				
		return flag;
	}

	public static void main(String[] args) {
		Program1 prg = new Program1();
		Scanner scan =new Scanner(System.in);
		char entermore='Y';
		while(entermore=='Y' || entermore=='y') {
			System.out.println("Enter the String to be reversed: ");
			String input = scan.nextLine();
			System.out.println("The reserved String:"+ prg.reverse(input));
			
			System.out.println("Enter the Array to be reversed: ");
			String[] arr = scan.nextLine().split(" ");
			System.out.println("The reserved Array:"+ Arrays.toString(prg.reverseArray(arr)));
			
			System.out.println("Enter the First Array: ");
			String[] arr1 = scan.nextLine().split(" ");
			System.out.println("Enter the Second Array: ");
			String[] arr2 = scan.nextLine().split(" ");
			System.out.println("Is both array equal :"+ prg.isEqual(arr1,arr2));
			
			System.out.println("Want to Enter more (Y/N): ");
			entermore = scan.nextLine().charAt(0);
		}
		scan.close();

	}

}
