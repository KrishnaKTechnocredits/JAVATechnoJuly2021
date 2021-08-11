package genius;

public class Assignment_7 {
	
	void printAllEvenNumberBetweenRange(int startIndex, int endIndex) {
		int index;
		System.out.println("Even numbers are:");
		for(index=startIndex;index<=endIndex;index++) {
			if(index%2==0) {
			    System.out.println(index);
			}
		}
	}
	
	void printAllNumbersDivisibleBy5(int startIndex, int endIndex) {
		int index;
		System.out.println("Divisible by 5,numbers are:");
		for(index=startIndex;index<=endIndex;index++) {
			if(index%5==0) {
				System.out.println(index);
			}
		}
	}
	
	void  printAllNumbersDivisibleBy5AndDivisibleBy3(int startIndex, int endIndex) {
		int index;
		System.out.println("Divisible by 5 & 3, numbers are:");
		for(index=startIndex;index<=endIndex;index++) {
			if(index%3==0 && index%5==0) {
				System.out.println(index);
			}
		}
	}
	
	void printAllNumbersDivisibleBy7Or13(int startIndex, int endIndex) {
		int index;
		for(index=startIndex;index<=endIndex;index++) {
			if(index%7==0){
				System.out.println(+index + "is divisible by 7");
			}
			else if(index%13==0){
				System.out.println(+index + "is divisible by 13");
			}
		}
	}
	
	void sumOfAllNumbers(int startIndex, int endIndex) {
		int index;
		int sum=0;
		for(index=startIndex;index<=endIndex;index++) {
			sum = sum+index;
		}
		System.out.println("sum is "+sum);
	}
	
	void differenceBetweenSumOfOddNumbersAndEvenNumbers(int startIndex, int endIndex) {
		int index;
		int evenSum=0, oddSum=0;
		for(index=startIndex;index<=endIndex;index++) {
			if(index%2==0) {
				evenSum=evenSum+index;
			}
			else if(index%2!=0) {
				oddSum=oddSum+index;
			}
		}
		System.out.println("Difference between Odd Numbers sum and Even Numbers sum is "+(oddSum-evenSum));
	}
	
	void printOddNumbersInReverseOrder(int startIndex, int endIndex) {
		int index;
		System.out.println("Odd numbers in reverse order are");
		for(index=endIndex;index>startIndex-1;index--) {
			if(index%2!=0) {
				System.out.println(index);
		    }
		}
	
	}
	

	public static void main(String[] args) {
		Assignment_7 assignment_7 = new Assignment_7();
		assignment_7.printAllEvenNumberBetweenRange(10, 15);
		System.out.println("-------------------------------------------");
		assignment_7.printAllNumbersDivisibleBy5(10, 30);
		System.out.println("-------------------------------------------");
		assignment_7.printAllNumbersDivisibleBy5AndDivisibleBy3(5,18);
		System.out.println("-------------------------------------------");
		assignment_7.printAllNumbersDivisibleBy7Or13(5,40);
		System.out.println("-------------------------------------------");
		assignment_7.sumOfAllNumbers(1,5);
		System.out.println("-------------------------------------------");
		assignment_7.differenceBetweenSumOfOddNumbersAndEvenNumbers(3,9);
		System.out.println("-------------------------------------------");
		assignment_7.printOddNumbersInReverseOrder(10,20);
	}

}
