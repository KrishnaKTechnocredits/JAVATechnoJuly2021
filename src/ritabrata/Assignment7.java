package ritabrata;

public class Assignment7 {

	void printEvenNumbers(int startValue, int endValue){
		for(int index= startValue; index>=endValue; index++) {
			if(index%2==0) {
			System.out.println(index);
			}
		}
	}
	void printNumbersDivisibleByFive(int startValue, int endValue){
		for(int index= startValue; index>=endValue; index++) {
			if(index%5==0) {
			System.out.println(index);
			}
		}
		
	}
	void printNumDivBy5And3(int startValue, int endValue) {
		for(int index=startValue; index<=endValue; index++) {
			if (index%5 == 0 && index%3 == 0)
				System.out.println(index);
		}
	}

	void printNumDivBy7Or13(int startValue, int endValue) {
		for(int index=startValue; index<=endValue; index++) {
			if (index%7 == 0)
				System.out.println(index + " is divisible by 7");
			else if (index%13 == 0)
				System.out.println(index + " is divisible by 13");
		}
	}
	
	void add(int startValue, int endValue) {
		int sum=0;
		for(int index=startValue; index<=endValue; index++) {
			sum = sum + index;
		}
		System.out.println("Sum of numbers is: " + sum);
	}
	
	void difference(int startValue, int endValue) {
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
	
	void printOddNumbersReverse(int startValue, int endValue) {
		for(int index=startValue; index>=endValue; index--) {
			if (index%2 != 0)
				System.out.println(index);
		}
	}
	
	public static void main(String[] args) {
		Assignment7 assignment7 = new Assignment7();
		System.out.println("Even numbers are:");
		assignment7.printEvenNumbers(10, 15);
		System.out.println("Divisible by 5, numbers are:");
		assignment7.printNumbersDivisibleByFive(10, 30);
		System.out.println("Divisible by 5 & 3, numbers are:");
		assignment7.printNumDivBy5And3(5, 18);
		System.out.println("Divisible by 7 or 13, numbers are:");
		assignment7.printNumDivBy7Or13(5, 40);
		assignment7.add(1, 5);
		assignment7.difference(3, 9);
		System.out.println("Odd Numbers in reverse order :");
		assignment7.printOddNumbersReverse(20, 10);
	}
	
}


