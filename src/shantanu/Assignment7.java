package shantanu;

public class Assignment7 {
	
	void printEvenNumbersInRange(int startIndex, int endIndex) {
		System.out.println("Even numbers between "+ startIndex + " and "+ endIndex + "are:");
		for(int index = startIndex;index <= endIndex;index++) {
			if(index % 2 == 0)
				System.out.println(index);
		}
	}
	
	void printNumbersDivisibleByFive(int startIndex, int endIndex) {
		System.out.println("Numbers divisible by 5 between "+ startIndex +" and "+ endIndex + " are:");
		for(int index = startIndex; index <= endIndex; index++) {
			if(index % 5 == 0)
				System.out.println(index);
		}
	}
	
	void printNumbersDivisibleByThreeAndFive(int startIndex, int endIndex) {
		System.out.println("Numbers divisible by 3 and 5 between "+ startIndex + " and " + endIndex + " are:");
		for(int index = startIndex; index <= endIndex; index++) {
			if(index % 3 == 0 && index % 5 == 0)
				System.out.println(index);
		}
	}
	
	void printNumbersDivisibleBySevenOrThirteen(int startIndex, int endIndex) {
		for(int index = startIndex; index <= endIndex; index++) {
			if(index % 7 == 0 && index % 13 == 0)
				System.out.println(index + " is divisible by both 7 and 13");
			else if(index % 7 == 0)
				System.out.println(index + " is divisible by 7.");
			else if(index % 13 == 0)
				System.out.println(index + " is divisible by 13.");
		}
	}
	
	void printSumOfAllNumbersInRange(int startIndex, int endIndex) {
		int sum = 0;
		for(int index = startIndex; index <= endIndex; index++)
			sum = sum + index;
		System.out.println("Sum is: "+ sum);
	}
	
	void printDiffBetweenSumOfOddAndEvenNumbersInRange(int startIndex, int endIndex) {
		int sumOdd=0, sumEven=0;
		for(int index = startIndex; index <= endIndex; index++) {
			if(index % 2 == 0)
				sumEven = sumEven + index;
			else
				sumOdd = sumOdd + index;
		}
		System.out.println("Difference between sum of odd numbers and sum of even numbers is: " + (sumOdd - sumEven));	
	}
	
	void printOddNumbersInReverseOrder(int startIndex, int endIndex) {
		for(int index = endIndex; index >= startIndex; index--) {
			if(index % 2 != 0)
				System.out.println(index);
		}
	}
	
	public static void main(String args[]) {
		Assignment7 assignment7 = new Assignment7();
		System.out.println("---Even numbers in range---");
		assignment7.printEvenNumbersInRange(10, 15);
		System.out.println("---Numbers divisible by 5 in range---");
		assignment7.printNumbersDivisibleByFive(10, 30);
		System.out.println("---Numbers divisible by 5 and 3 in range---");
		assignment7.printNumbersDivisibleByThreeAndFive(5, 18);
		System.out.println("---Numbers divisible by 7 or 13 in range---");
		assignment7.printNumbersDivisibleBySevenOrThirteen(5, 40);
		System.out.println("---Sum of all numbers in range---");
		assignment7.printSumOfAllNumbersInRange(1, 5);
		System.out.println("---Diff Between sum of odd and even numbers in range---");
		assignment7.printDiffBetweenSumOfOddAndEvenNumbersInRange(3, 9);
		System.out.println("---Odd numbers in reverse order---");
		assignment7.printOddNumbersInReverseOrder(10, 20);
	}
}
