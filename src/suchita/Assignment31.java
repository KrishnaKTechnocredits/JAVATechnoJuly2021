package suchita;

//Assignment31


import java.util.Arrays;
import java.util.Scanner;

class Assignment31 {

	//Verify given number is perfect number or not
	void isPerfectNumber(int input) {
		
		int output = 0;
		
		for (int index = 1; index < input; index++) {
			if (input % index == 0) {
				output += index;
			}
		}
		
		if (output == input)
			System.out.println(input + " is perfect Number");
		else
			System.out.println(input + " is not perfect Number");
	}
	
	//Verify given number is a perfect square
	void isPerfectSquare(int input) {
		
		int sq =(int) Math.sqrt(input);
		int output = sq * sq;
		
		if (output == input)
			System.out.println(input + " is perfect Sqaure");
		else
			System.out.println(input + " is not perfect square");
	}
	
	//Find consecutive numbers in given array
	void findTriplet(int[] input) {
		
		int temp = 0; 
		int index = 0;
		int count = 0;
		
		System.out.println("\nInput array :: " + Arrays.toString(input));
		while(index < input.length-2) {
			temp = input[index];
			if(((temp+1) == input[index+1]) && ((2+temp) == input[index+2]))
			count++;
			index++;		
			
		}
		System.out.println("Number of triplets present in the array : " + count);
	}
	
	//In a user given range find all perfect numbers
	void findAllPerfectNumbers(int start,int end) {
		
		System.out.println("\nPrint perfect number between given range "+ start + " and " + end);
		for(int index=start;index<=end ;index++)
		{	boolean flag=false;
			int i=1;

			int num = 0;
			while(i<index)
			{
				if(index % i==0)
					num += i;
			i++;
			}

			if(num == index )
				flag= true;
			else
				flag= false;


			if(flag)
				System.out.println(index);	

			}		
		
		/*
			for (int i = 1; i < index; i++) {
				if (index % i == 0) {
					output += i;
				}
			}
		
			if (output == index) 
				flag = true;
			else
				flag = false;
			if(flag) */
				//System.out.println(index + " is perfect Number");
				
			
		
		
	}
	
	public static void main(String[] args) {
		
		Assignment31 assignment = new Assignment31();
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nEnter number to check perfect number or not :: ");
		int input1 = scanner.nextInt();
		assignment.isPerfectNumber(input1);
		System.out.println("\nEnter number to check perfect square or not :: ");
		int input2 = scanner.nextInt();
		assignment.isPerfectSquare(input2);
		int[] input3 = {10,23,24,25,26,61,62,64,65,66};
		assignment.findTriplet(input3);
		//int num1 = 1; int num2 = 100;
		assignment.findAllPerfectNumbers(1,140);
	}
	
}