package precilla.assignment28;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class HighestNumber {
	int secondHighestNumber(int[] number) {
		int index=0;
		int max=number[index];
		int secondhighest=0;
		for(index=1;index<number.length;index++) {
			
			if(number[index]>max) {
				secondhighest=max;
				max=number[index];
			}
			else if(number[index]>secondhighest) 
				secondhighest=number[index];
		}
		return secondhighest;
	}
	void nthHighestNumber(int number,int[] arr) {
		int highestIndex, max=0,startNumber=0;
		while(startNumber<number) {
			int index=0;
			 max=arr[index];
			 highestIndex=0;
			for(index=1;index<arr.length;index++) {
				if(arr[index]>max) {
					max=arr[index];
					highestIndex=index;
				}
			}
			arr[highestIndex]=0;
			startNumber++;
		}
		System.out.println("Output: " +max);
	}
	public static void main(String[] args) {
		HighestNumber secondHighestNumber=new HighestNumber();
		System.out.println("Program 1:Second highest number from array");
		int[] arr = {10,23,2,11,55,43,99};
		int input;
		System.out.println("Input :"+Arrays.toString(arr));
		System.out.println("Output: " +secondHighestNumber.secondHighestNumber(arr));	
		System.out.println("\nProgram 2:Nth highest number from array");
		System.out.println("Input :"+Arrays.toString(arr));
		System.out.print("Enter the N value : ");
		Scanner scanner=new Scanner(System.in);
		input=scanner.nextInt();
		secondHighestNumber.nthHighestNumber(input,arr);
		scanner.close();
	}

}
