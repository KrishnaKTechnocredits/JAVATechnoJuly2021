//Assignment 13 : 15th Aug'2021
//
//program 1 : return count of positive numbers from given array.
//int[] input = {1,-11,-44,23,55,-99,-23,-22};
//output : 3
//
//program 2 : count number of zero's in given array.
//int[] input = {1,-11,0,0,55,0,-23,0};
//
//output : 4
//
//
//program 3 : write a method which returns 5 smaller numbers of the given number.
//input : 50
//output : 49, 48, 47, 46, 45



package bhakti;

import java.util.concurrent.SynchronousQueue;

public class Assignment_13_array {
	//program 1 : return count of positive numbers from given array.
	int getPostivieNumberFromArray(int[] arry) {
		int count=0;
		for (int index=0; index<arry.length; index++ ) {
			if (arry[index] >0 ) {
				count++;
			}	
		}
		return count;
	 }
	//program 2 : count number of zero's in given array.
	int getNumberOf0FromArray(int[] array) {
		int count=0;
		for (int index=0; index<array.length; index++ ) {
			if (array[index] ==0 ) {
				count++;
			}	
		}
		return count;
	}
	
	//program 3 : write a method which returns 5 smaller numbers of the given number.
	int[] get5smallerNumber(int num) {
		int[] numers= new int[5];
		 
		
		for (int index=0; index <5; index++) {
			num--;
			numers[index]= num;
		}
		return numers;
	}
			
	public static void main (String[] sss) {
		int[] input = {1,-11,-44,23,55,-99,-23,-22};
		int[] input1 = {1,-11,0,0,55,0,-23,0};
		int[] number1 = new int [5];
		Assignment_13_array assignment_13_array= new Assignment_13_array();
		
		//int count = assignment_13_array.getPostivieNumberFromArray(input); option 1
		//System.out.println(count); option 1
		System.out.println("Count of postive number form provided array is: "+assignment_13_array.getPostivieNumberFromArray(input));// option  2 
		System.out.println("Count of zero number form provided array is: "+assignment_13_array.getNumberOf0FromArray(input1));
		// please suggest if anything can be written in better manner 
		int num=55;
		number1=assignment_13_array.get5smallerNumber(num);
		System.out.println("5 smaller number from "+num+" :");
		for (int index=0; index<5; index++) 
			System.out.println(number1[index]);
		
	}

}
