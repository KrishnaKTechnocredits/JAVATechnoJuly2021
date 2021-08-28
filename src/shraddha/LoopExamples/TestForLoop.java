package shraddha.LoopExamples;

public class TestForLoop {
	public static void main(String[] args) {
		TestForLoop testForLoop = new TestForLoop();
		testForLoop.printEvenNumbers();
		testForLoop.divisibleByFive(10, 30);
		testForLoop.divisibleByFiveAndThree(5, 17);
		testForLoop.divisibleBySevenOrThirteen(5, 40);
		testForLoop.sumOfNumbers(1, 5);
		testForLoop.sumOfOddAndEven(3, 9);
		testForLoop.printOddReverse(10, 20);
	}
	
	void printEvenNumbers() {
		System.out.println("--------------------------------");
		System.out.println("Even numbers are :");
		for(int index=10; index<=15; index++)
		{
			if(index % 2 == 0) {
				System.out.println(index);
			}
		}
	}
	
	void divisibleByFive(int startIndex, int endIndex) {
		System.out.println("--------------------------------");
		System.out.println("Divisible by 5, numbers are:");
		for(int index = startIndex; index <= endIndex; index++) {
			if(index % 5 == 0) {
				System.out.println(index);
			}
		}
	}
	
	void divisibleByFiveAndThree(int startIndex, int endIndex) {
		System.out.println("--------------------------------");
		System.out.println("Divisible by 5 and 3, numbers are:");
		for(int index = startIndex; index <= endIndex; index++) {
			if(index % 5 == 0 && index % 3 == 0)
				System.out.println(index);
		}
		
	}
	
	void divisibleBySevenOrThirteen(int startIndex, int endIndex) {
		System.out.println("--------------------------------");
		System.out.println("Divisible by 7 or 13, numbers are:");
		for(int index = startIndex; index <= endIndex; index++) {
			if(index % 7 == 0 || index % 13 == 0) {
				if(index % 7 == 0)
					System.out.println(index+" is divisible by 7");
				else
					System.out.println(index+" is divisible by 13");
			}
		}
		
	}
	
	void sumOfNumbers(int startIndex, int endIndex) {
		int sum = 0;
		for(int index = startIndex; index <= endIndex; index++) {
			sum = sum + index;
		}
		System.out.println("--------------------------------");
		System.out.println("Sum is "+ sum);
	}
	
	void sumOfOddAndEven(int startIndex, int endIndex) {
		int sumOfOdd = 0;
		int sumOfEven = 0;
		System.out.println("--------------------------------");
		for(int index = startIndex; index <= endIndex; index++) {
			if(index % 2 == 0)
				sumOfEven = sumOfEven + index;
			else
				sumOfOdd = sumOfOdd + index;
				
		}
		int result = sumOfOdd-sumOfEven;
		System.out.println(result);
		
	}
	
	void printOddReverse(int startIndex, int endIndex) {
		System.out.println("--------------------------------");
		System.out.println("Output in reverse order is :");
		for(int index = endIndex; index >= startIndex; index--) {
			if(index % 2 != 0)
				System.out.println(index);
		}
	}

}
