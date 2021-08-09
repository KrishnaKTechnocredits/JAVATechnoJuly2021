package dattaraj;

public class Assignment7 {

	void printEven(int startValue, int endValue) {
		for(int index=startValue; index<=endValue; index++) {
			if (index%2 == 0)
				System.out.println(index);
		}
	}
	
	void NumDivBy5(int startValue, int endValue) {
		for(int index=startValue; index<=endValue; index++) {
			if (index%5 == 0)
				System.out.println(index);
		}
	}
	
	void NumDivBy5And3(int startValue, int endValue) {
		for(int index=startValue; index<=endValue; index++) {
			if (index%5 == 0 && index%3 == 0)
				System.out.println(index);
		}
	}
	
	void NumDivBy7Or13(int startValue, int endValue) {
		for(int index=startValue; index<=endValue; index++) {
			if (index%7 == 0)
				System.out.println(index + " is divisible by 7");
			else if (index%13 == 0)
				System.out.println(index + " is divisible by 13");
		}
	}
	
	void sum(int startValue, int endValue) {
		int sum=0;
		for(int index=startValue; index<=endValue; index++) {
			sum = sum + index;
		}
		System.out.println("Sum of numbers is: " + sum);
	}
	
	void diff(int startValue, int endValue) {
		int diff, sumEven=0, sumOdd=0;
		for(int index=startValue; index<=endValue; index++) {
			if (index%2 != 0)
				sumOdd = sumOdd + index;
			else
				sumEven = sumEven + index;
		}
		diff= sumOdd - sumEven;
		System.out.println("Difference is: " + diff);
	}
	
	void OddNumbersReverse(int startValue, int endValue) {
		for(int index=startValue; index>=endValue; index--) {
			if (index%2 != 0)
				System.out.println(index);
		}
	}
	
	public static void main(String[] args) {
		Assignment7 assignment7 = new Assignment7();
		
		System.out.println("Even numbers:");
		assignment7.printEven(15, 25);
		
		System.out.println("Divisible by 5:");
		assignment7.NumDivBy5(25, 50);
		
		System.out.println("Divisible by 5 & 3:");
		assignment7.NumDivBy5And3(3, 30);
		
		System.out.println("Divisible by 7 or 13:");
		assignment7.NumDivBy7Or13(13, 28);
		
		assignment7.sum(1, 10);
		assignment7.diff(4, 7);
		
		System.out.println("Odd numbers in reverse order:");
		assignment7.OddNumbersReverse(50, 10);
	}
}