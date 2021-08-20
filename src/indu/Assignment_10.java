package indu;

public class Assignment_10 
{	
	int primeSum = 0;
	int primeNumCount = 0;
	int startNUmber ;
	int endNUmber ;
	
	void printPrimeNumberOrNot(int number)
	{
		boolean status = true;
		for(int index = 2 ; index < number ; index++)
		{
			if(number % index == 0)
			{
				status = false;
				System.out.println(number+ " is not  a prime number");
				break;
			}
		}
		
		if(status)
		{
			System.out.println(number+ " is a prime number");
		}	
	}
	
	void verifyPrimeNumber(int number)
	{
		boolean status = true;
		for(int index = 2 ; index < number ; index++)
		{
			if(number % index==0)
			{
				status = false;
				break;
			}
		}
		
		if(status)
		{
			System.out.println(number+ " is a prime number");
			primeSum = primeSum + number; 
			primeNumCount++;
		}
	}
	
	void findPrimeNumberWithinRange(int startNum , int endNum)
	{
		startNUmber = startNum;
		endNUmber = endNum;
		System.out.println("Prime NUmbers from range "+ startNum +" to " + endNum + " : ");
		for( ; startNum <= endNum ; startNum++)
		{
			verifyPrimeNumber(startNum);	
		}	
	}
	
	void sumOfPrimeNUmbers()
	{
		System.out.println("Sum of all the prime number from  range  " + startNUmber + " to " + endNUmber + " = " +primeSum);
	}
	
	void countOfPrimeNUmbers()
	{
		System.out.println("Count of all the prime number from  range  " + startNUmber + " to " + endNUmber + " = " +primeNumCount);
	}
	
	void averageOfPrimeNUmbers()
	{
		double average = primeSum/primeNumCount;
		System.out.println("Average of all the prime number from  range  " + startNUmber + " to " + endNUmber + " = " + average );
	}
	
	public static void main(String[] s)
	{
		Assignment_10 assignment_10 = new Assignment_10();
		assignment_10.printPrimeNumberOrNot(10);
		assignment_10.printPrimeNumberOrNot(23);
		System.out.println("-----------------------------------");	
		assignment_10.findPrimeNumberWithinRange(100,110);
		System.out.println("-----------------------------------");	
		assignment_10.sumOfPrimeNUmbers();
		assignment_10.countOfPrimeNUmbers();
		assignment_10.averageOfPrimeNUmbers();
		
	}
}
