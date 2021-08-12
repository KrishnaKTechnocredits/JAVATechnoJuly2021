package anurag;

public class PrimeNumber {
	int count;
	int sum;
	float avg;
	void numberIsPrime(int number)
	{
		int primeStatus = 0 ;
		
		/*if(number == 0 || number == 1) 
			System.out.println("number is not Prime number");*/
		for(int i=2;i<number;i++)
		{
			if(number % i == 0)
			{
				primeStatus = 1;
				//System.out.println(number+" is not Prime number");
				break;
			}
		}
		if(primeStatus == 0)
		{
			System.out.println(number+" is Prime number");
			count++;
			sum = sum + number;
			avg=sum/count;
		
		}
		
	}
	
	void printPrimeNumber(int startIndex, int endIndex)
	{
		for(int number = startIndex; number<=endIndex;number++)
		{
			numberIsPrime(number);
			startIndex=number;	
		}
		
	}
	
	public static void main(String args[])
	{
		PrimeNumber primeNumber = new PrimeNumber();
		//primeNumber.numberIsPrime(17);
		primeNumber.printPrimeNumber(100,120);
		System.out.println("Count of all prime number - "+primeNumber.count);
		System.out.println("Sum of all prime number - "+primeNumber.sum);
		System.out.println("Avg of all prime number - "+primeNumber.avg);
	}

}


