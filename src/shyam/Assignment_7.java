package shyam;

public class Assignment_7 {
	
	void printAllEvenNoBetweenRange(int startIndex, int endIndex) {
		int index;
		for(index=startIndex; index<=endIndex; index++) {
			if(index%2== 0) {
			    System.out.println(index);
			}
		}
	}
	
	void printAllNumbersDivBy5(int startIndex, int endIndex) {
		int index;
		for(index=startIndex; index<=endIndex; index++) {
			if(index%5==0) {
				System.out.println(index);
			}
		}
	}
	
	void  printAllNumbersDivBy5AndDivBy3(int startIndex, int endIndex) {
		int index;
		for(index=startIndex; index<=endIndex; index++) {
			if(index%3==0 && index%5==0) {
				System.out.println(index);
			}
		}
	}
	
	void printAllNumbersDivBy7Or13(int startIndex, int endIndex) {
		int index;
		for(index=startIndex;index<=endIndex;index++) {
			if(index%7==0){
				System.out.println(index + "  is divisible by 7");
			}
			else if(index%13==0){
				System.out.println(index + "is divisible by 13");
			}
		}
	}
	
	void sumOfAllNumbers(int startIndex, int endIndex) {
		int index;
		int sum=0;
		for(index=startIndex; index<=endIndex; index++) {
			sum =sum+index;
		}
		System.out.println("Sum is "+sum);
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
		System.out.println(" Ans="+(oddSum-evenSum));
	}

	void printOddNumbersInReverseOrder(int startIndex, int endIndex) {
		int index;
		for(index=endIndex;index>startIndex-1;index--) {
			if(index%2!=0) {
				System.out.println(index);
		    }
		}

	}
	
	public static void main(String[] args) {
		Assignment_7 assignment_7 = new Assignment_7();
		assignment_7.printAllEvenNoBetweenRange(50,55);
		assignment_7.printAllNumbersDivBy5(20, 25);
		assignment_7.printAllNumbersDivBy5AndDivBy3(15,20);
		assignment_7.printAllNumbersDivBy7Or13(1,7);
		assignment_7.sumOfAllNumbers(1,5);
		assignment_7.differenceBetweenSumOfOddNumbersAndEvenNumbers(1,5);
		assignment_7.printOddNumbersInReverseOrder(1,5);
	}
	
}
