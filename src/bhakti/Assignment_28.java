/*Assignment - 28 : 4th Sep'2021 

Program 1: Find second highest number from array.
int[] arr = {10,23,2,11,55,43,99};
output : 55

Program 2: Find nth highest number from array.
int[] arr = {10,23,2,11,55,43,99};
input n = 3;
output : 43*/

package bhakti;

import java.util.Arrays;


public class Assignment_28 {
	
	//1.  find second number of greatest number  
	
	void findGrestestSeconnumber(int[] input) {
		 
		int firstnumber=input[0];
		int secondNumber=input[0];
		 
		 			
		for (int index=0; index< input.length; index++) {
			if (input[index]>firstnumber) {
				secondNumber=firstnumber;
				firstnumber=input[index];
			}	
		}
		System.out.println(secondNumber);
	}
	
	//2.1 make array sorted 
	int[] getarrySorted(int[] input) {
		int max=input[0];
		for (int index=0; index< input.length; index++) {
			if (input[index]>max)
				max=input[index];
		}
		for (int index=0; index< input.length; index++) {
			if (input[index]==max)
				input[index]=0;
		}
		return input;
		
	}
	//2:  to get greatest n number of array by passing arry 
	void findNthGreatestNumber(int[] arry, int num) {
		int[] arry2= new int[arry.length];
		for (int index=0; index<arry.length; index++) {
			arry2[index]=arry[index];
		}
		System.out.println("---------------------------");
		System.out.println("Provided array is"+Arrays.toString(arry2));
		
		if (num>arry2.length || num<=0) {
			System.out.println("invalid input it should be in between 1 to "+arry.length);
		}else {
			int max=arry2[0];
			for(int x=num; x>1; x--) {
				arry2=getarrySorted(arry2);
			}
		
			//System.out.println(Arrays.toString(arry2));
			for (int index=0; index< arry2.length; index++) {
				if(arry2[index]>max)
					max=arry[index]; 
			}
			System.out.println("Greatest "+num+" number is "+max); 
		}	
			
	}

	public static void main(String[] jh) {
		Assignment_28 assignment_28= new Assignment_28();
		int[] arry = {10,23,2,11,55,43,99};
		assignment_28.findNthGreatestNumber(arry, 8);
		assignment_28.findNthGreatestNumber(arry, 1);
		assignment_28.findNthGreatestNumber(arry, 3);
		assignment_28.findNthGreatestNumber(arry, 2);
		assignment_28.findNthGreatestNumber(arry, 4);
		assignment_28.findNthGreatestNumber(arry, -2);
	}
	
}
