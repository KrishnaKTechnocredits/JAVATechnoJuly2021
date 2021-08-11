package monika;

public class Asignment_7 {

	public static void main(String[] args) {
		
		Asignment_7 assignment_7=new Asignment_7();
		assignment_7.printEvenNubers(10,15);
		assignment_7.printDivisibleByFive(10,30);
		assignment_7.printDivisibleByFiveAndThree(5,18);
		assignment_7.printDivisibleBySevenOrThirteen(5,40);
		assignment_7.printSum(1,5);
		assignment_7.diffSumOfOddAndEven(3,9);
		assignment_7.printOddReverse(10,20);

	}
	
	public void  printEvenNubers(int startIndex,int endIndex)
	{
		System.out.println("Even Numbers Are: ");
		for(int i=startIndex;i<=endIndex;i++)
		{
			if(i%2 == 0)
			{
				System.out.println(i);
			}
		}
	}
	
	public void printDivisibleByFive(int startIndex,int endIndex)
	{
		System.out.println("------------------------------------");
		System.out.println("Divisible by 5, Numbers are : ");
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
		System.out.println("------------------------------------");
		System.out.println("Divisible by 5 & 3, Numbers are : ");
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
		System.out.println("------------------------------------");
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
		System.out.println("------------------------------------");
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
		System.out.println("------------------------------------");
		System.out.println("Output :"+diff);
	}
	
	public void printOddReverse(int startIndex,int endIndex)
	{
		System.out.println("------------------------------------");
		for(int i=endIndex;i>=startIndex;i--)
		{
			if(i%2 != 0)
			{
				System.out.println(i);
			}
		}
	}
	
	
}
	