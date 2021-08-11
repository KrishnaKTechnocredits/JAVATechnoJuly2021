// For Loop Assignment
package indu;

public class Assignment_7 
{
	void displayEvenNumber(int startIndex , int endIndex)
	{
		System.out.println("----------------------------------------------------------");
		System.out.println("Even Numbers are : ");

		for(int index = startIndex ; index <= endIndex ; index++)
		{
			if(index % 2 == 0 )
			{
				System.out.println(index);
			}
		}
		
	}
	
	void displayDivisibleBy5(int startIndex , int endIndex)
	{
		System.out.println("----------------------------------------------------------");
		System.out.println("Numbers Divisible by 5 are : ");
		
		for(int index = startIndex ; index <= endIndex ; index++)
		{
			if(index % 5 == 0 )
			{
				System.out.println(index);
			}
		}
		
	}
	
	void displayDivisbleBy3and5(int startIndex , int endIndex)
	{
		System.out.println("----------------------------------------------------------");
		System.out.println("Numbers Divisible by 3 and 5 are : ");
		
		for(int index = startIndex ; index <= endIndex ;index++)
		{
			
				if(index % 3 == 0 && index % 5 == 0 )
				{
					System.out.println(index);
				
				}
		}
	}
	
	void displayDivisbleBy7and13(int startIndex , int endIndex)
	{
		System.out.println("----------------------------------------------------------");
		System.out.println("Numbers Divisible by 7 and 13 are : ");
		
		for(int index = startIndex ; index <= endIndex ; index++)
		{
					if(index % 7 == 0)
					{
						System.out.println(index + " is divisible by 7");
					}
					else if(index % 13 == 0 )
					{
						System.out.println(index + " is divisible by 13");
					}		
		}
	}
	
	void sumOfAllNumbers(int startIndex , int endIndex)
	{
		System.out.println("----------------------------------------------------------");
		
		int sum = 0;
		for( int index = startIndex ; index <= endIndex ; index++)
		{
				
				sum = sum + index ;	
		}
		System.out.println("Sum of numbers between range " +startIndex+ " and " +endIndex+ " = "  +sum);
	}
	
	void subBetweenSumOfEvenOddNumber(int startIndex , int endIndex)
	{
		System.out.println("----------------------------------------------------------");
		
		int oddSum = 0;
		int evenSum = 0;
		
		for( int index = startIndex ; index <= endIndex ; index++)
		{
				if(index % 2 == 0)
				{
					evenSum = evenSum + index ;	
				}
				else
				{
					oddSum = oddSum + index ;
				}
		}
		System.out.println("Even number Sum is " + evenSum);
		System.out.println("Odd number Sum is " + oddSum);
		
		if(oddSum > evenSum)
		{
			System.out.println("Difference between sum of all odd number & even number is " + (oddSum - evenSum));
		}
		else
		{
			System.out.println("Difference between sum of all Even number & odd number is " + (evenSum - oddSum));
		}
	}
	
	void reverseOddNumber(int startIndex , int endIndex)
	{
		System.out.println("----------------------------------------------------------");
		System.out.println("Odd Numbers in reverse order : ");
		
		for(int index = endIndex ; index >= startIndex ; index--)
		{
			if(index % 2 != 0)
			{
				System.out.println(index);
			}
		}
	}
	
	public static void main(String[] args)
	{
		Assignment_7 assignment_7 = new Assignment_7();
		assignment_7.displayEvenNumber(10, 15);
		assignment_7.displayDivisibleBy5(10, 30);
		assignment_7.displayDivisbleBy3and5(5, 30);
		assignment_7.displayDivisbleBy7and13(5, 40);
		assignment_7.sumOfAllNumbers(1,10);
		assignment_7.subBetweenSumOfEvenOddNumber(4, 10);
		assignment_7.reverseOddNumber(10, 20);
	}
}
