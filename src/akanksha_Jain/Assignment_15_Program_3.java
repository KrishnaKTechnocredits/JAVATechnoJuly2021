package akanksha_Jain;

import chaitanya.ass6SITemp;

public class Assignment_15_Program_3 {
	static int oddNumber=0, evenNumber=0, diff=0;
	
	void findEvenOddNumber(int[] arr) {
		for(int index=0; index<arr.length; index++) {
			if(arr[index]%2==0) {
				evenNumber = evenNumber + arr[index];
			}
			else {
				oddNumber = oddNumber + arr[index];
			}
		}
	}
	
	void diff(int evenNumber, int oddNumber) {
		if(evenNumber>oddNumber) {
			diff = evenNumber - oddNumber;
		}
		else {
			diff = oddNumber - evenNumber;
		}
	}
	
	public static void main(String[] args) {
		int[] arr= {12,2,13,9};
		Assignment_15_Program_3 program_3 = new Assignment_15_Program_3();
		program_3.findEvenOddNumber(arr);
		program_3.diff(evenNumber, oddNumber);
		System.out.println("The difference between sum of even numbers - sum of odd numbers in given array is " + diff);
	}
}
