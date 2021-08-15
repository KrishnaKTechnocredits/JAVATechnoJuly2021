package anurag;

public class Assignment_7 {

	
	void printEvenNumber(int startIndex, int endIndex) {
		
		for(int i=startIndex;i<=endIndex; i++)
		{
			int evenNum = i%2;
			if(evenNum == 0)
			{
				System.out.println("Even numbers are : " +i);
			}
			startIndex = i;
						
		}
	}
	
	void divisibleBy5(int startIndex, int endIndex) {
		
		for(int i=startIndex;i<=endIndex; i++)
		{
			int numberDivisibleBy5 = i%5;
			
			if(numberDivisibleBy5 == 0)
			{
				System.out.println("Divisible by 5, numbers are : " +i);
				
			}
			startIndex = i;								
		}
	}
	
	void numDivisibleBy5And3(int startIndex, int endIndex) {
		
		for(int i=startIndex;i<=endIndex; i++)
		{
			int numberDivisibleBy5 = i%3;
			
			if(numberDivisibleBy5 == 0)
			{
				if(i%5 == 0)
				System.out.println("Divisible by 3 and 5, numbers are : " +i);
				
			}
			startIndex = i;								
		}
	}
	void numDivisibleBy7OR13(int startIndex, int endIndex) {
		
		System.out.println("Divisible by 7 or 13, numbers are : ");
		for(int i=startIndex;i<=endIndex; i++)
		{
			int numDivisibleby7or13 = 0;
			if(i%7 == 0)
				numDivisibleby7or13 =7;
			else if(i%13 == 0)
				numDivisibleby7or13 =13;
			
			if(i%7 == 0  || i%13 == 0)
			{
				System.out.println(i+" is divisible by " +numDivisibleby7or13);
				
			}
			startIndex = i;								
		}
	}
	
	void sumOfNumbers(int startIndex, int endIndex) 
	{
		int sum = 0;
		for(int i=startIndex;i<=endIndex; i++)
		{
			sum = sum +i;
			startIndex = i;			
		}
		System.out.println("sum is " +sum);							
		
	}
	
	void diffBetweenOddAndEvenNum(int startIndex, int endIndex) {
		
		int sumOfEvenNum=0 ;
		int evenNum, oddNum;
		int sumOfOddNum = 0; ;
		int diffBetweenOddAndEvenNumbers;
		for(int i=startIndex;i<=endIndex; i++)
		{
			if(i%2 == 0)
			{
				evenNum = i;
				//System.out.println("Even numbers are : " +evenNum);
				sumOfEvenNum = sumOfEvenNum+evenNum ;
			}
			else 
			{
				oddNum = i;
				//System.out.println("Odd numbers are : " +oddNum);
				sumOfOddNum = sumOfOddNum+oddNum ;
			}
			startIndex = i;
						
		}
		System.out.println("Sum of even numbers are : " +sumOfEvenNum);
		System.out.println("Sum of odd numbers are : " +sumOfOddNum);
		diffBetweenOddAndEvenNumbers = sumOfOddNum - sumOfEvenNum;
		System.out.println("difference between sum of Odd and even numbers : " +diffBetweenOddAndEvenNumbers);
	}
	
	void oddNumbersInReverse(int startIndex, int endIndex) 
	{		
		int oddNum;
		for(int i=endIndex;i>=startIndex; i--)
		{
			if(i%2 == 1)
			{
				oddNum = i;
				System.out.println("Odd numbers are : " +oddNum);				
			}
			endIndex = i;
						
		}		
	}
	public static void main(String args[])
	{
		Assignment_7 number = new Assignment_7();
		number.printEvenNumber(10, 15);
		number.divisibleBy5(10, 30);
		number.numDivisibleBy5And3(5,18);
		number.numDivisibleBy7OR13(5,40);
		number.sumOfNumbers(1, 5);
		number.diffBetweenOddAndEvenNum(3, 9);
		number.oddNumbersInReverse(10, 20);
		
	}
}
