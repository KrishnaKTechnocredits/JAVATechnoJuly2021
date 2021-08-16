package nishi;

public class Assignment7 {

	public static void main(String[] args) {
		
		Assignment7 assignment7=new Assignment7();
		assignment7.printEvenNubers(10,15);
		assignment7.printDivisibleByFive(10,30);
		assignment7.printDivisibleByFiveAndThree(5,18);
		assignment7.printDivisibleBySevenOrThirteen(5,40);
		assignment7.printSum(1,5);
		assignment7.diffSumOfOddAndEven(3,9);
		assignment7.printOddReverse(10,20);

	}
	
	public void  printEvenNubers(int startIndex,int endIndex)
	{
		System.out.println("Even numbers are: ");
		for(int i = startIndex;i <= endIndex;i++)
		{
			if(i%2 == 0)
			{
				System.out.println(i);
			}
		}
	}
	
	public void printDivisibleByFive(int startIndex,int endIndex)
	{
		System.out.println("Divisible by 5, numbers are : ");
		for(int i=startIndex;i<=endIndex;i++)
		{
			if(i%5 == 0)
			{
				System.out.println(i);
			}
		}
	}
	
	public void printDivisibleByFiveAndThree(int startIndex,int endIndex)
	{
		System.out.println("Divisible by 5 & 3, numbers are : ");
		for(int i=startIndex;i<=endIndex;i++)
		{
			if(i%5 == 0 && i%3 == 0)
			{
				System.out.println(i);
			}
		}
	}
	
	public void printDivisibleBySevenOrThirteen(int startIndex,int endIndex)
	{
		System.out.println("Divisible by 7 or 13, numbers are :");
		for(int i=startIndex;i<=endIndex;i++)
		{			
			if(i%7 == 0)
			{
				System.out.println(i+" is divisible by 7");
			}
			if(i%13 == 0)
			{
				System.out.println(i+" is divisible by 13");
			}
		}
	}
	
	public void printSum(int startIndex,int endIndex)
	{
		int sum = 0;		
		for(int i=startIndex;i<=endIndex;i++)
		{
			sum+=i;
		}
		System.out.println("Sum is "+sum);
	}
	
	public void diffSumOfOddAndEven(int startIndex,int endIndex)
	{
		int sumOfOdd =0;
		int sumOfEven=0;
		int diff = 0;
		for(int i = startIndex;i<=endIndex;i++)
		{
			if(i%2==0)
			{
				sumOfEven+=i;
			}
			else
			{
				sumOfOdd+=i;
			}
		}
		diff=sumOfOdd-sumOfEven;
		System.out.println("Output :"+diff);
	}
	
	public void printOddReverse(int startIndex,int endIndex)
	{
		for(int i=endIndex;i>=startIndex;i--)
		{
			if(i%2 != 0)
			{
				System.out.println(i);
			}
		}
	}
	
	
}
	


