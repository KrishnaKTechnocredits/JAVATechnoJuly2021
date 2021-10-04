package suchita;

// Assignment 39

// Fibonacci Series

class Assignment39 {

	void getFibonacci (int number) {
		
		int sum = 0;
		int num1 = 0;
		int num2 = 1;
		
		System.out.println("\nPrinting Fibonacci series "+number+ " times::");
		System.out.print(num1);
		System.out.print("," + num2);
		for(int index=0; index<number-2; index++) {
			
			sum = num1 + num2;
			System.out.print("," + sum);
			num1 = num2;
			num2 = sum;
		}
	}
	
	public static void main(String[] args) {
		
		Assignment39 assignment = new Assignment39();
		assignment.getFibonacci(8);
	}
}