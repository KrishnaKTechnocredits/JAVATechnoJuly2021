package shantanu.assignment31;

import java.util.Scanner;

public class PerfectNumbersInRange {
	boolean isPerfectNumber(int num) {
		int sum = 0;
		for(int divisor = 1; divisor <= num/2; divisor++) {
			if(num%divisor == 0)
				sum += divisor;
		}
		if(sum == num)
			return true;
		else
			return false;
	}
	void displayPerfectNumbersInGivenRange(int start, int end) {
		System.out.println("Perfect numbers between "+start+" and "+end+" are:");
		for(int num = start; num <= end; num++) {
			if(isPerfectNumber(num))
				System.out.println(num);
		}
	}
	public static void main(String[] args) {
		PerfectNumbersInRange perfectNumbersInRange = new PerfectNumbersInRange();
		System.out.println("Enter start of the range");
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		System.out.println("Enter end of the range");
		int end = sc.nextInt();
		perfectNumbersInRange.displayPerfectNumbersInGivenRange(start,end);
		
	}
}
