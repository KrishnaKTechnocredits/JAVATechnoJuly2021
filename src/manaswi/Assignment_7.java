package manaswi;

public class Assignment_7 
{
	void printEvenNumbers(int startValue, int endValue) 
	{
		for(int index=startValue; index<=endValue; index++) 
		{
			if (index%2 == 0)
				System.out.println(index);
		}
	}
	
	void printNumDivBy5(int startValue, int endValue) 
	{
		for(int index=startValue; index<=endValue; index++) 
		{
			if (index%5 == 0)
				System.out.println(index);
		}
	}
	
	void printNumDivBy5And3(int startValue, int endValue) 
	{
		for(int index=startValue; index<=endValue; index++) 
		{
			if (index%5 == 0 && index%3 == 0)
				System.out.println(index);
		}
	}
	
	void printNumDivBy7Or13(int startValue, int endValue) 
	{
		for(int index=startValue; index<=endValue; index++) 
		{
			if (index%7 == 0)
				System.out.println(index + " is divisible by 7");
			else if (index%13 == 0)
				System.out.println(index + " is divisible by 13");
		}
	}
	
	void sum(int startValue, int endValue) 
	{
		int sum=0;
		for(int index=startValue; index<=endValue; index++)
		{
			sum = sum + index;
		}
		System.out.println("Sum of numbers is: " + sum);
	}
	
	void difference(int startValue, int endValue) 
	{
		int diff, sumEven=0, sumOdd=0;
		for(int index=startValue; index<=endValue; index++)
		{
			if (index%2 != 0)
				sumOdd = sumOdd + index;
			else
				sumEven = sumEven + index;
		}
		diff= sumOdd - sumEven;
		System.out.println("Difference is: " + diff);
	}
	
	void printOddNumbersReverse(int startValue, int endValue) 
	{
		for(int index=startValue; index>=endValue; index--)
		{
			if (index%2 != 0)
				System.out.println(index);
		}
	}
	
	public static void main(String[] args) 
	{
		Assignment_7 assignment_7_1 = new Assignment_7();
		System.out.println("Even numbers are:");
		assignment_7_1.printEvenNumbers(10, 15);
		System.out.println("Divisible by 5, numbers are:");
		assignment_7_1.printNumDivBy5(10, 30);
		System.out.println("Divisible by 5 & 3, numbers are:");
		assignment_7_1.printNumDivBy5And3(5, 18);
		System.out.println("Divisible by 7 or 13, numbers are:");
		assignment_7_1.printNumDivBy7Or13(5, 40);
		assignment_7_1.sum(1, 5);
		assignment_7_1.difference(3, 9);
		System.out.println("Odd Numbers in reverse order:");
		assignment_7_1.printOddNumbersReverse(20, 10);
	}
}