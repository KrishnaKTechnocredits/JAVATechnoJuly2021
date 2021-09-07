package technocredits1.scannerDemo;

import java.util.Scanner;

public class Example1 {
	int sumOfElements(int[] input) {
		int sum = 0;
		for(int index=0;index<input.length;index++) {
			sum += input[index];
		}
		return sum;
	}
	
	int[] getData() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many numbers you want to enter : ");
		int totalElements = scanner.nextInt();
		
		int[] arr = new int[totalElements];
		
		for(int index=0;index<arr.length;index++) {
			System.out.println("Enter number :");
			arr[index] = scanner.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		
		Example1 example1 = new Example1();
		int[] arr = example1.getData();
		example1.getData();
		int total = example1.sumOfElements(arr);
		System.out.println("Total sum is : " + total);
		
		/*scanner.close();
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int temp = scanner1.nextInt();
		System.out.println("temp is " + temp);*/
	}
}
