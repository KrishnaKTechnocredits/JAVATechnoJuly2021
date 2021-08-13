package sneha;

public class Assignment_7 {
	
	void printEven(int start, int end) {
		int i = 0;
		System.out.println("Even numbers in given range are:");
		for(i = start; i<= end; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
	
	void divisibleBy_5(int start, int end) {
		int i = 0;
		System.out.println("Numbers divisible by 5 in given range are:");
		for(i=start; i<=end; i++) {
			if(i%5 == 0) {
				System.out.println(i);
			}
		}
	}

	void divisibleBy_3And_5(int start, int end) {
		int i = 0;
		System.out.println("Numbers divisible by 3 and 5 are:");
		for(i = start; i<=end; i++) {
			if((i%3 == 0) && (i%5 == 0)) {
				System.out.println(i);
			}
		}
	}
	
	void divisibleBy_13_Or_7(int start, int end) {
		int i = 0;
		for(i = start; i<=end; i++) {
			if(i % 7 == 0) {
				System.out.println(i + " is divisible by 7");
			}
			else if(i%13 == 0) {
				System.out.println(i + " is divisible by 13");
			}
		}
	}
	
	void sumInRange(int start, int end) {
		int sum = 0;
		int i =0;
		for(i = start; i<= end; i++) {
			sum = sum + i;
		}
		System.out.println("Sum of all numbers in given range is: " + sum);
	}
	
	void differneceSumOfEvenOdd(int start, int end) {
		int evenSum = 0, oddSum = 0, i = 0;
		
		for(i =start; i<=end; i++) {
			if(i % 2 == 0) {
				evenSum= evenSum + i;
			}
			else {
				oddSum = oddSum + i;
			}
		}
		int diff = oddSum - evenSum;
		System.out.println("Differnece is: " + diff);
	}
	
	void oddReverse(int start, int end) {
		int i = 0;
		for(i = end; i>= start; i--) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] a) {
		
		Assignment_7 assignment_7 = new Assignment_7();
		
		assignment_7.printEven(10,20);
		assignment_7.divisibleBy_5(10, 30);
		assignment_7.divisibleBy_3And_5(15, 30);
		assignment_7.divisibleBy_13_Or_7(13, 40);
		assignment_7.sumInRange(1, 5);
		assignment_7.differneceSumOfEvenOdd(3, 9);
		assignment_7.oddReverse(10, 20);
	}
}
