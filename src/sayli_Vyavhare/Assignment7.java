package sayli_Vyavhare;

public class Assignment7 {
	
	void evenNum(int startIndex,int endIndex){
		System.out.println("Even mumbers are:");
		for (; startIndex<=endIndex;startIndex++){
			if(startIndex%2==0) {
				System.out.println(startIndex);
			}
		}
		System.out.println();
	}
	
	void divisibleByFive(int startIndex,int endIndex){
		System.out.println("Divisible by 5 are:");
		for (; startIndex<=endIndex;startIndex++){
			if(startIndex%5==0) {
				System.out.println(startIndex);
			}
		}
		System.out.println();
	}
	
	void divisibleByFiveAndThree(int startIndex,int endIndex){
		System.out.println("Divisible by 3 & 5 are:");
		for (; startIndex<=endIndex;startIndex++){
			if(startIndex%3==0 && startIndex%5==0) {
				System.out.println(startIndex);
			}
		}
		System.out.println();
	}
	
	void divisibleBySevenOrThirteen(int startIndex,int endIndex){
		for (; startIndex<=endIndex;startIndex++){
			if(startIndex%7==0 ) {
				System.out.println(startIndex + " is divisible by " + 7);
			}
			else if(startIndex%13==0)
				System.out.println(startIndex + " is divisible by " + 13);
		}
		System.out.println();
	}
	
	void sumInGivenRange(int startIndex,int endIndex) {
		int sum=0;
		for(;startIndex<=endIndex;startIndex++) {
			sum=sum+startIndex;
		}
		System.out.println("Sum is:"+ sum+"\n");
	}
	
	void differenceBetweenOddEvenNum(int startIndex,int endIndex){
		System.out.println("Difference between sum of odd and even number is: ");
		int sumOdd=0;
		int sumEven=0;
		for (; startIndex<=endIndex;startIndex++){
			if(startIndex%2==0) {
			    sumEven=sumEven+startIndex;
			}
			else if(startIndex%2!=0) {
				sumOdd=sumOdd+startIndex;
			}
		}
		int diffNo=sumOdd-sumEven;
		System.out.println(diffNo);
	 }
	void oddNumberInReverse(int startIndex,int endIndex) {
		System.out.println("Odd numbers in reverse order are:");
		for(;endIndex>=startIndex;endIndex--) {
			if (endIndex%2!=0)
				System.out.println(endIndex);			
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Assignment7 assignment7 = new Assignment7();
		assignment7.evenNum(10,15);
		assignment7.divisibleByFive(10,30);
		assignment7.divisibleByFiveAndThree(5,18);
		assignment7.divisibleBySevenOrThirteen(5,40);
		assignment7.sumInGivenRange(1, 5);
		assignment7.oddNumberInReverse(10,20);
		assignment7.differenceBetweenOddEvenNum(3,9);
		}	
}

