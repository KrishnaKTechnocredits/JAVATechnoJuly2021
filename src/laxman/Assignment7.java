package laxman;

public class Assignment7 {
	
	void evenNumbers(int startIndex, int endIndex){
		System.out.println("Even Numbers are: ");
		for(int index= startIndex;index<=endIndex;index++) {
		if (index % 2 == 0)
			System.out.println(index);	
		}
	}
	void divisibleByFive(int startIndex, int endIndex) {
		System.out.println("Numbers Divisible by 5 are :");
		for(int index= startIndex;index<=endIndex;index++) {
		if(index % 5==0)
			System.out.println(index);
		}
	}
	void divisbleByfiveAndThree(int startIndex, int endIndex) {
		System.out.println("Number Divisible by 3 and 5 is:");
		for(int index=startIndex;index<=endIndex;index++) {
			if(index % 3==0 && index % 5==0)
				System.out.println(index);
		}
	}
	void divisibleBy7And13(int startIndex, int endIndex) {
		System.out.println("Numbers Divisible by 7 ad 13 are :");
		for(int index=startIndex;index<=endIndex;index++) {
		if(index % 7==0 )
			System.out.println(index + " Divisible by 7");
		else if(index % 13==0)
			System.out.println(index + " Divisible by 13");
		}
	}
	void sumOfAllNumbers(int startIndex,int endIndex) {
		int sum = 0;
		for(int index=startIndex;index<=endIndex;index++) {
			sum = sum + index;
		}
		System.out.println("Sum of all number is "+ sum);
	}
	void differenceBetweenEvenAndOdd(int startIndex,int endIndex) {
		System.out.println("Difference is :");
		int evenSum = 0;
		int oddSum = 0;
		for(int index= startIndex;index<=endIndex;index++) {
			if(index % 2==0)
			evenSum=evenSum + index;
			else
			oddSum=oddSum + index;
		}
			
			if(evenSum>oddSum)
				System.out.println(evenSum-oddSum);
			else
				System.out.println(oddSum-evenSum);
			}
	

	void printOddNumbersInReverse(int startIndex,int endIndex){
		System.out.println("Odd Numbers in Reverse order :");
		for(int index=startIndex;index>=10;index--) {
			if(index % 2!=0)
				System.out.println(index);
		}
	}
	
	public static void main(String[]args) {
		Assignment7 assignment7 = new Assignment7();
		assignment7.evenNumbers(10,15);
		assignment7.divisibleByFive(10,30);
		assignment7.divisbleByfiveAndThree(5,18);
		assignment7.divisibleBy7And13(5,40);
		assignment7.sumOfAllNumbers(1,5);
		assignment7.differenceBetweenEvenAndOdd(3,9);
		assignment7.printOddNumbersInReverse(20,10);
	}

}
